package com.springboot.boqdetails.model;

public class RatesModel {

    private String ratesId;
    private float baseSupplyRate;
    private Float supplyRate;
    private float baseLaborRate;
    private float laborRate;

    public RatesModel() {
    }

    public RatesModel(String ratesId, float baseSupplyRate, Float supplyRate, float baseLaborRate, float laborRate) {
        this.ratesId = ratesId;
        this.baseSupplyRate = baseSupplyRate;
        this.supplyRate = supplyRate;
        this.baseLaborRate = baseLaborRate;
        this.laborRate = laborRate;
    }

    public String getRatesId() {
        return ratesId;
    }

    public void setRatesId(String ratesId) {
        this.ratesId = ratesId;
    }

    public float getBaseSupplyRate() {
        return baseSupplyRate;
    }

    public void setBaseSupplyRate(float baseSupplyRate) {
        this.baseSupplyRate = baseSupplyRate;
    }

    public Float getSupplyRate() {
        return supplyRate;
    }

    public void setSupplyRate(Float supplyRate) {
        this.supplyRate = supplyRate;
    }

    public float getBaseLaborRate() {
        return baseLaborRate;
    }

    public void setBaseLaborRate(float baseLaborRate) {
        this.baseLaborRate = baseLaborRate;
    }

    public float getLaborRate() {
        return laborRate;
    }

    public void setLaborRate(float laborRate) {
        this.laborRate = laborRate;
    }

    @Override
    public String toString() {
        return "RatesModel{" +
                "ratesId='" + ratesId + '\'' +
                ", baseSupplyRate=" + baseSupplyRate +
                ", supplyRate=" + supplyRate +
                ", baseLaborRate=" + baseLaborRate +
                ", laborRate=" + laborRate +
                '}';
    }
}
