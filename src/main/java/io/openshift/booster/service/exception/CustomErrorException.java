package io.openshift.booster.service.exception;

public class CustomErrorException extends RuntimeException {

    public CustomErrorException(String error) {
        super("Damn error " + error + " was generated!");
    }
}