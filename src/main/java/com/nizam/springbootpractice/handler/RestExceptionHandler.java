package com.nizam.springbootpractice.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {
    
    @ExceptionHandler
    public String handleException(Exception exception){
        return exception.getMessage();
    }
}
