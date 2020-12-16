package com.springboot.boqdetails.controller;

import com.springboot.boqdetails.entity.InventoryDetailsEntity;
import com.springboot.boqdetails.request.InventoryDetailsRequest;
import com.springboot.boqdetails.response.InventoryDetailsDeleteResponse;
import com.springboot.boqdetails.service.InventoryDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/InventoryDetails")
public class InventoryDetailsController {

    @Autowired
    InventoryDetailsService inventoryDetailsService;

    @PostMapping
    public InventoryDetailsEntity createInventoryDetails(@RequestBody InventoryDetailsRequest inventoryDetailsRequest){
        return inventoryDetailsService.createInventoryDetails(inventoryDetailsRequest);
    }

    @GetMapping("/{inventoryDetailsId}")
    public InventoryDetailsEntity getInventoryDetails(@PathVariable("inventoryDetailsId") String inventoryDetailsId){
        return inventoryDetailsService.getInventoryDetails(inventoryDetailsId);
    }

    @DeleteMapping("/{inventoryDetailsId}")
    public InventoryDetailsDeleteResponse deleteInventoryDetails(@PathVariable ("inventoryDetailsId") String inventoryDetailsId){
        return inventoryDetailsService.deleteInventoryDetails(inventoryDetailsId);
    }

    @PutMapping("/{inventoryDetailsId}")
    public InventoryDetailsEntity updateInventoryDetails(@PathVariable("inventoryDetailsId") String inventoryDetailsId,@RequestBody InventoryDetailsRequest inventoryDetailsRequest){
        return inventoryDetailsService.updateInventoryDetails(inventoryDetailsId,inventoryDetailsRequest);
    }
}
