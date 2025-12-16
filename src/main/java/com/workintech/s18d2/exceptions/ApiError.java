package com.workintech.s18d2.exceptions;

public class ApiError {
    private String message;
    private int status;

    // Parametresiz constructor
    public ApiError() {
    }

    // Parametreli constructor
    public ApiError(String message, int status) {
        this.message = message;
        this.status = status;
    }

    // Getter ve Setter metodları
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}