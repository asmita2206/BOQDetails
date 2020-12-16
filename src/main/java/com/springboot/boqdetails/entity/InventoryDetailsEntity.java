package com.springboot.boqdetails.entity;

import com.springboot.boqdetails.InventoryDetailsId;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(InventoryDetailsId.class)
@Table(name = "inventory_details")
public class InventoryDetailsEntity {

    @Id
    private String inventoryDetailsId;
    @Id
    private String productDefinitionId;
    @Id
    private String ratesId;
    private int size;
    private int quantity;

    public InventoryDetailsEntity() {
    }

    public InventoryDetailsEntity(String inventoryDetailsId, String productDefinitionId, String ratesId, int size, int quantity) {
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
