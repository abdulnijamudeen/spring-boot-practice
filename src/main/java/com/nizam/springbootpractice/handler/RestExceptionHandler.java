package com.nizam.springbootpractice.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {
    
    @ExceptionHandler
    public ResponseEntity<String> handleRestException(RestException exception){
        return new ResponseEntity<>(exception.getMessage(), exception.getStatus());
    }
    
    @ExceptionHandler
    public String handleException(Exception exception){
        return exception.getMessage();
    }
}
