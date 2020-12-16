package com.springboot.boqdetails.service;

import com.springboot.boqdetails.constants.StringConstants;
import com.springboot.boqdetails.entity.BOQHeaderEntity;
import com.springboot.boqdetails.exception.NoRecordFoundException;
import com.springboot.boqdetails.repository.BOQHeaderRepo;
import com.springboot.boqdetails.request.BOQHeaderRequest;
import com.springboot.boqdetails.response.BOQHeaderDeleteResponse;
import com.springboot.boqdetails.utils.BoqDetailsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BOQHeaderService {

    @Autowired
    BOQHeaderRepo boqHeaderRepo;

    public BOQHeaderEntity createBOQHeader(BOQHeaderRequest boqHeaderRequest) {

        String boqHeaderId = BoqDetailsUtils.generateId(StringConstants.boqHeaderId_prefix);
        BOQHeaderEntity boqHeaderEntity = new BOQHeaderEntity();
        boqHeaderEntity.setBoqHeaderId(boqHeaderId);
        boqHeaderEntity.setClassVal(boqHeaderRequest.getClassVal());
        boqHeaderEntity.setPressure(boqHeaderRequest.getPressure());
        boqHeaderEntity.setTemperature(boqHeaderRequest.getTemperature());
        boqHeaderEntity.setUitity(boqHeaderRequest.getUitity());

        return boqHeaderRepo.save(boqHeaderEntity);
    }

    public BOQHeaderEntity getBOQHeader(String boqHeaderId) {

        BOQHeaderEntity boqHeaderEntity = boqHeaderRepo.findByboqHeaderId(boqHeaderId).orElseThrow(() -> {
            return new NoRecordFoundException("Record_not_found :" + boqHeaderId);
        });
        return boqHeaderEntity;
    }

    public BOQHeaderDeleteResponse deleteBOQHeader(String boqHeaderId) {
        BOQHeaderEntity boqHeaderEntity = boqHeaderRepo.findByboqHeaderId(boqHeaderId).orElseThrow(() -> {
            return new NoRecordFoundException("Record_not_found :" + boqHeaderId);
        });
        BOQHeaderDeleteResponse boqHeaderDeleteResponse = new BOQHeaderDeleteResponse(boqHeaderId, true);
        boqHeaderRepo.delete(boqHeaderEntity);
        return boqHeaderDeleteResponse;
    }

    public BOQHeaderEntity updateBOQHeader(String boqHeaderId, BOQHeaderRequest boqHeaderRequest) {

        BOQHeaderEntity boqHeaderEntity = boqHeaderRepo.findByboqHeaderId(boqHeaderId).orElseThrow(() -> {
            return new NoRecordFoundException("Record_not_found :" + boqHeaderId);
        });

        boqHeaderEntity.getBoqHeaderId();
        boqHeaderEntity.setUitity(boqHeaderRequest.getUitity());
        boqHeaderEntity.setTemperature(boqHeaderRequest.getTemperature());
        boqHeaderEntity.setPressure(boqHeaderRequest.getPressure());
        boqHeaderEntity.setClassVal(boqHeaderRequest.getClassVal());
        return boqHeaderRepo.save(boqHeaderEntity);
    }
}
