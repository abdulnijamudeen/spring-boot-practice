package com.nizam.springbootpractice.handler;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.log4j.Log4j2;

@RestControllerAdvice
@Log4j2
public class RestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleRestException(RestException exception) {
        log.error(exception);
        ErrorResponse errorResponse = new ErrorResponse(exception.getMessage(), exception.getStatus().getReasonPhrase(), LocalDateTime.now());
        return new ResponseEntity<>(errorResponse, exception.getStatus());
    }

    @ExceptionHandler
    public String handleException(Exception exception) {
        log.error(exception);
        return exception.getMessage();
    }
}
