package com.springboot.boqdetails.response;

public class BOQDetailsDeleteResponse {

    private String boqId;
    private Boolean boqIdDeleted;

    public BOQDetailsDeleteResponse(String boqId, Boolean boqIdDeleted) {
        this.boqId = boqId;
        this.boqIdDeleted = boqIdDeleted;
    }

    public String getBoqId() {
        return boqId;
    }

    public void setBoqId(String boqId) {
        this.boqId = boqId;
    }

    public Boolean getBoqIdDeleted() {
        return boqIdDeleted;
    }

    public void setBoqIdDeleted(Boolean boqIdDeleted) {
        this.boqIdDeleted = boqIdDeleted;
    }
}
