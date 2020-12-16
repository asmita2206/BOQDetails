package com.springboot.boqdetails.service;

import com.springboot.boqdetails.constants.StringConstants;
import com.springboot.boqdetails.entity.RatesEntity;
import com.springboot.boqdetails.exception.NoRecordFoundException;
import com.springboot.boqdetails.repository.RatesRepo;
import com.springboot.boqdetails.request.RatesRequest;
import com.springboot.boqdetails.response.RatesDeleteResponse;
import com.springboot.boqdetails.utils.BoqDetailsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatesService {

    @Autowired
    RatesRepo ratesRepo;

    public RatesEntity createRates(RatesRequest ratesRequest) {
        String ratesId= BoqDetailsUtils.generateId(StringConstants.ratesId_prefix);

        RatesEntity ratesEntity=new RatesEntity();
        ratesEntity.setRatesId(ratesId);
        ratesEntity.setBaseLaborRate(ratesRequest.getBaseLaborRate());
        ratesEntity.setBaseSupplyRate(ratesRequest.getBaseSupplyRate());
        ratesEntity.setLaborRate(ratesRequest.getLaborRate());
        ratesEntity.setSupplyRate(ratesRequest.getSupplyRate());

        return ratesRepo.save(ratesEntity);
    }

    public RatesEntity getRates(String ratesId) {
        RatesEntity ratesEntity=ratesRepo.findByratesId(ratesId).orElseThrow(()->{
            return new NoRecordFoundException("Record_not_found :" +ratesId);

        });
        return ratesEntity;
    }

    public RatesDeleteResponse deleteRates(String ratesId) {

        RatesEntity ratesEntity=ratesRepo.findByratesId(ratesId).orElseThrow(()->{
            return new NoRecordFoundException("Record_not_found :" +ratesId);

        });
        RatesDeleteResponse ratesDeleteResponse=new RatesDeleteResponse(ratesId,true);
        ratesRepo.delete(ratesEntity);
        return ratesDeleteResponse;
    }

    public RatesEntity updateRates(String ratesId, RatesRequest ratesRequest) {

        RatesEntity ratesEntity=ratesRepo.findByratesId(ratesId).orElseThrow(()->{
            return new NoRecordFoundException("Record_not_found :" +ratesId);

        });
        ratesEntity.getRatesId();
        ratesEntity.setSupplyRate(ratesRequest.getSupplyRate());
        ratesEntity.setLaborRate(ratesRequest.getLaborRate());
        ratesEntity.setBaseSupplyRate(ratesRequest.getBaseSupplyRate());
        ratesEntity.setBaseLaborRate(ratesRequest.getBaseLaborRate());

        return ratesRepo.save(ratesEntity);

    }
}
