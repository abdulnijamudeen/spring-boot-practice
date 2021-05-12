package com.nizam.springbootpractice.handler;

import org.springframework.http.HttpStatus;

public class RestException extends Exception {

    private HttpStatus status;
    
    public RestException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
    
    public HttpStatus getStatus() {
        return status;
    }
}
