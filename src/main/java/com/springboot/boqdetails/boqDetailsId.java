package com.springboot.boqdetails;

import java.io.Serializable;

public class boqDetailsId implements Serializable {

    private String boqId;
    private String projectId;
    private String poDetailsId;
    private String inventoryDetailsId;
    private String boqHeaderId;

    public boqDetailsId() {
    }

    public boqDetailsId(String boqId, String projectId, String poDetailsId, String inventoryDetailsId, String boqHeaderId) {
        this.boqId = boqId;
        this.projectId = projectId;
        this.poDetailsId = poDetailsId;
        this.inventoryDetailsId = inventoryDetailsId;
        this.boqHeaderId = boqHeaderId;
    }
}
