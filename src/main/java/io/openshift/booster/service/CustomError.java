package io.openshift.booster.service;

public class CustomError {
    private final String errorMessage;

    public CustomError() {
        this.errorMessage = null;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public CustomError(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
