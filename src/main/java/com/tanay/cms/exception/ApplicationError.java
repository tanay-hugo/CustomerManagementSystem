package com.tanay.cms.exception;

public class ApplicationError {
    private String message;
    private int code;

    public String getError() {
        return message;
    }

    public void setMessage(String error) {
        this.message = error;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
