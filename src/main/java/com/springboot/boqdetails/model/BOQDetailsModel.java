package com.springboot.boqdetails.model;

public class BOQDetailsModel {

    private String boqId;
    private String projectId;
    private String poDetailsId;
    private String inventoryDetailsId;
    private String boqHeaderId;
    private int versionNumber;

    public BOQDetailsModel() {
    }

    public BOQDetailsModel(String boqId, String projectId, String poDetailsId, String inventoryDetailsId, String boqHeaderId, int versionNumber) {
        this.boqId = boqId;
        this.projectId = projectId;
        this.poDetailsId = poDetailsId;
        this.inventoryDetailsId = inventoryDetailsId;
        this.boqHeaderId = boqHeaderId;
        this.versionNumber = versionNumber;
    }

    public String getBoqId() {
        return boqId;
    }

    public void setBoqId(String boqId) {
        this.boqId = boqId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getPoDetailsId() {
        return poDetailsId;
    }

    public void setPoDetailsId(String poDetailsId) {
        this.poDetailsId = poDetailsId;
    }

    public String getInventoryDetailsId() {
        return inventoryDetailsId;
    }

    public void setInventoryDetailsId(String inventoryDetailsId) {
        this.inventoryDetailsId = inventoryDetailsId;
    }

    public String getBoqHeaderId() {
        return boqHeaderId;
    }

    public void setBoqHeaderId(String boqHeaderId) {
        this.boqHeaderId = boqHeaderId;
    }

    public int getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(int versionNumber) {
        this.versionNumber = versionNumber;
    }

    @Override
    public String toString() {
        return "BOQDetailsModel{" +
                "boqId='" + boqId + '\'' +
                ", projectId='" + projectId + '\'' +
                ", poDetailsId='" + poDetailsId + '\'' +
                ", inventoryDetailsId='" + inventoryDetailsId + '\'' +
                ", boqHeaderId='" + boqHeaderId + '\'' +
                ", versionNumber=" + versionNumber +
                '}';
    }
}
