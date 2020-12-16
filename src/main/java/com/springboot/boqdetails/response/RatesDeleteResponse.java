package com.springboot.boqdetails.response;

import com.springboot.boqdetails.constants.StringConstants;

public class RatesDeleteResponse {

    private String ratesId;
    private boolean ratesIdDeleted;

    public RatesDeleteResponse(String ratesId, boolean ratesIdDeleted) {
        this.ratesId = ratesId;
        this.ratesIdDeleted = ratesIdDeleted;
    }

    public String getRatesId() {
        return ratesId;
    }

    public void setRatesId(String ratesId) {
        this.ratesId = ratesId;
    }

    public boolean isRatesIdDeleted() {
        return ratesIdDeleted;
    }

    public void setRatesIdDeleted(boolean ratesIdDeleted) {
        this.ratesIdDeleted = ratesIdDeleted;
    }
}
