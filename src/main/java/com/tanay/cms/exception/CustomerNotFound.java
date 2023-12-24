package com.tanay.cms.exception;


public class CustomerNotFound extends RuntimeException {
    private CustomerNotFound (String message){
        super(message);
    }
}
