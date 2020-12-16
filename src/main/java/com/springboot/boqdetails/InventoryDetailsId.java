package com.springboot.boqdetails;

import java.io.Serializable;

public class InventoryDetailsId  implements Serializable {

    private String inventoryDetailsId;
    private String productDefinitionId;
    private String ratesId;

    public InventoryDetailsId() {
    }

    public InventoryDetailsId(String inventoryDetailsId, String productDefinitionId, String ratesId) {
        this.inventoryDetailsId = inventoryDetailsId;
        this.productDefinitionId = productDefinitionId;
        this.ratesId = ratesId;
    }
}
