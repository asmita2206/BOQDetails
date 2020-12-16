package com.springboot.boqdetails.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "boq_header")
public class BOQHeaderEntity {

    @Id
    private String boqHeaderId;
    private float pressure;
    private float temperature;
    private String uitity;
    private String classVal;

    public BOQHeaderEntity() {
    }

    public BOQHeaderEntity(String boqHeaderId, float pressure, float temperature, String uitity, String classVal) {
        this.boqHeaderId = boqHeaderId;
        this.pressure = pressure;
        this.temperature = temperature;
        this.uitity = uitity;
        this.classVal = classVal;
    }

    public String getBoqHeaderId() {
        return boqHeaderId;
    }

    public void setBoqHeaderId(String boqHeaderId) {
        this.boqHeaderId = boqHeaderId;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public String getUitity() {
        return uitity;
    }

    public void setUitity(String uitity) {
        this.uitity = uitity;
    }

    public String getClassVal() {
        return classVal;
    }

    public void setClassVal(String classVal) {
        this.classVal = classVal;
    }

    @Override
    public String toString() {
        return "BOQHeaderModel{" +
                "boqHeaderId='" + boqHeaderId + '\'' +
                ", pressure=" + pressure +
                ", temperature=" + temperature +
                ", uitity='" + uitity + '\'' +
                ", classVal='" + classVal + '\'' +
                '}';
    }
}
