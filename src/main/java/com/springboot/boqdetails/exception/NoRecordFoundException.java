package com.springboot.boqdetails.exception;

public class NoRecordFoundException extends RuntimeException {

    public NoRecordFoundException(String message) {
        super(message);
    }
}
