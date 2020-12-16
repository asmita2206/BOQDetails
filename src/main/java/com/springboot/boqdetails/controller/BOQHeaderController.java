package com.springboot.boqdetails.controller;

import com.springboot.boqdetails.constants.StringConstants;
import com.springboot.boqdetails.entity.BOQHeaderEntity;
import com.springboot.boqdetails.request.BOQHeaderRequest;
import com.springboot.boqdetails.response.BOQHeaderDeleteResponse;
import com.springboot.boqdetails.service.BOQHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/BOQHeader")
public class BOQHeaderController {

    @Autowired
    BOQHeaderService boqHeaderService;

    @PostMapping
    public BOQHeaderEntity createBOQHeader(@RequestBody BOQHeaderRequest boqHeaderRequest){
        return boqHeaderService.createBOQHeader(boqHeaderRequest);
    }

    @GetMapping("{boqHeaderId}")
    public BOQHeaderEntity getBOQHeader(@PathVariable ("boqHeaderId")String boqHeaderId){
        return boqHeaderService.getBOQHeader(boqHeaderId);
    }

    @DeleteMapping("{boqHeaderId}")
    public BOQHeaderDeleteResponse deleteBOQHeader(@PathVariable ("boqHeaderId")String boqHeaderId){
        return boqHeaderService.deleteBOQHeader(boqHeaderId);
    }

    @PutMapping("{boqHeaderId}")
    public BOQHeaderEntity updateBOQHeader(@PathVariable ("boqHeaderId") String boqHeaderId,@RequestBody BOQHeaderRequest boqHeaderRequest){
        return boqHeaderService.updateBOQHeader(boqHeaderId,boqHeaderRequest);
    }
}
