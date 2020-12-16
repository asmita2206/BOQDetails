package com.springboot.boqdetails.model;

public class InventoryDetailsModel {

    private String inventoryDetailsId;
    private String productDefinitionId;
    private String ratesId;
    private int size;
    private int quantity;

    public InventoryDetailsModel() {
    }

    public InventoryDetailsModel(String inventoryDetailsId, String productDefinitionId, String ratesId, int size, int quantity) {
        this.inventoryDetailsId = inventoryDetailsId;
        this.productDefinitionId = productDefinitionId;
        this.ratesId = ratesId;
        this.size = size;
        this.quantity = quantity;
    }

    public String getInventoryDetailsId() {
        return inventoryDetailsId;
    }

    public void setInventoryDetailsId(String inventoryDetailsId) {
        this.inventoryDetailsId = inventoryDetailsId;
    }

    public String getProductDefinitionId() {
        return productDefinitionId;
    }

    public void setProductDefinitionId(String productDefinitionId) {
        this.productDefinitionId = productDefinitionId;
    }

    public String getRatesId() {
        return ratesId;
    }

    public void setRatesId(String ratesId) {
        this.ratesId = ratesId;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "InventoryDetailsModel{" +
                "inventoryDetailsId='" + inventoryDetailsId + '\'' +
                ", productDefinitionId='" + productDefinitionId + '\'' +
                ", ratesId='" + ratesId + '\'' +
                ", size=" + size +
                ", quantity=" + quantity +
                '}';
    }
}
