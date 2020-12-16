package com.springboot.boqdetails.service;

import com.springboot.boqdetails.constants.StringConstants;
import com.springboot.boqdetails.entity.BOQDetailsEntity;
import com.springboot.boqdetails.exception.NoRecordFoundException;
import com.springboot.boqdetails.repository.BOQDetailsRepo;
import com.springboot.boqdetails.request.BOQDetailsRequest;
import com.springboot.boqdetails.response.BOQDetailsDeleteResponse;
import com.springboot.boqdetails.utils.BoqDetailsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BOQDetailsService {

    @Autowired
    BOQDetailsRepo boqDetailsRepo;

    public BOQDetailsEntity createBOQ(BOQDetailsRequest boqDetailsRequest) {

     String boqId= BoqDetailsUtils.generateId(StringConstants.boqId_prefix);
     String projectId=BoqDetailsUtils.generateId(StringConstants.projectId_prefix);
     String poDetailsId=BoqDetailsUtils.generateId(StringConstants.projectId_prefix);
     String inventoryDetailsId=BoqDetailsUtils.generateId(StringConstants.inventoryDetailsId_prefix);
     String boqHeaderId=BoqDetailsUtils.generateId(StringConstants.boqHeaderId_prefix);
     BOQDetailsEntity boqDetailsEntity=new BOQDetailsEntity();
     boqDetailsEntity.setBoqHeaderId(boqHeaderId);
     boqDetailsEntity.setBoqId(boqId);
     boqDetailsEntity.setInventoryDetailsId(inventoryDetailsId);
     boqDetailsEntity.setProjectId(projectId);
     boqDetailsEntity.setPoDetailsId(poDetailsId);
     boqDetailsEntity.setVersionNumber(boqDetailsRequest.getVersionNumber());

     return boqDetailsRepo.save(boqDetailsEntity);
    }

    public BOQDetailsEntity getBOQ(String boqId) {
        BOQDetailsEntity boqDetailsEntity=boqDetailsRepo.findByboqId(boqId).orElseThrow(()->{
            return new NoRecordFoundException("NO_RECORD_FOUND :" +boqId);
        });
        return boqDetailsEntity;
    }

    public BOQDetailsDeleteResponse deleteBOQ(String boqId) {
        BOQDetailsEntity boqDetailsEntity=boqDetailsRepo.findByboqId(boqId).orElseThrow(()->{
            return new NoRecordFoundException("NO_RECORD_FOUND :" +boqId);
        });
        BOQDetailsDeleteResponse boqDetailsDeleteResponse=new BOQDetailsDeleteResponse(boqId,true);
        boqDetailsRepo.delete(boqDetailsEntity);
        return boqDetailsDeleteResponse;
    }

    public BOQDetailsEntity updateBOQ(String boqId,BOQDetailsRequest boqDetailsRequest) {
        BOQDetailsEntity boqDetailsEntity=boqDetailsRepo.findByboqId(boqId).orElseThrow(()->{
            return new NoRecordFoundException("NO_RECORD_FOUND :" +boqId);
        });
        boqDetailsEntity.getBoqHeaderId();
        boqDetailsEntity.getBoqId();
        boqDetailsEntity.getInventoryDetailsId();
        boqDetailsEntity.getPoDetailsId();
        boqDetailsEntity.getProjectId();
        boqDetailsEntity.setVersionNumber(boqDetailsRequest.getVersionNumber());
        return boqDetailsRepo.save(boqDetailsEntity);
    }
}
