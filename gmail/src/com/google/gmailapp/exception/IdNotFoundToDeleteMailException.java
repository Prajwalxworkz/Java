package com.google.gmailapp.exception;

public class IdNotFoundToDeleteMailException extends RuntimeException{
    public IdNotFoundToDeleteMailException(String errorMessage) {
        super(errorMessage);
    }
}
