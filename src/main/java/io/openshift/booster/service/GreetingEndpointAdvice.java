package io.openshift.booster.service;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;

import io.openshift.booster.service.exception.CustomErrorException;

@ControllerAdvice
@RequestMapping(produces = "application/vnd.error")
public class GreetingEndpointAdvice {

    @ResponseBody
    @ExceptionHandler(CustomErrorException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    CustomError serviceUnavailableExceptionHandler(CustomErrorException ex) {
        return new CustomError("ServiceUnavailableException was generated");
    }
}