package com.springboot.boqdetails.response;

public class InventoryDetailsDeleteResponse {

    private String inventoryDetailsId;
    private Boolean inventoryDetailsIdDeleted;

    public InventoryDetailsDeleteResponse(String inventoryDetailsId, Boolean inventoryDetailsIdDeleted) {
        this.inventoryDetailsId = inventoryDetailsId;
        this.inventoryDetailsIdDeleted = inventoryDetailsIdDeleted;
    }

    public String getInventoryDetailsId() {
        return inventoryDetailsId;
    }

    public void setInventoryDetailsId(String inventoryDetailsId) {
        this.inventoryDetailsId = inventoryDetailsId;
    }

    public Boolean isInventoryDetailsIdDeleted() {
        return inventoryDetailsIdDeleted;
    }

    public void setInventoryDetailsIdDeleted(Boolean inventoryDetailsIdDeleted) {
        this.inventoryDetailsIdDeleted = inventoryDetailsIdDeleted;
    }
}
