package com.springboot.boqdetails.response;

import com.springboot.boqdetails.constants.StringConstants;

public class BOQHeaderDeleteResponse {

    public String boqHeaderId;
    public boolean boqHeaderIdDeleted;

    public BOQHeaderDeleteResponse(String boqHeaderId, boolean boqHeaderIdDeleted) {
        this.boqHeaderId = boqHeaderId;
        this.boqHeaderIdDeleted = boqHeaderIdDeleted;
    }
}
