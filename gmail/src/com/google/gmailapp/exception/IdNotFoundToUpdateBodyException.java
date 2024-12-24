package com.google.gmailapp.exception;

public class IdNotFoundToUpdateBodyException extends RuntimeException{
    public IdNotFoundToUpdateBodyException(String errorMessage) {
        super(errorMessage);
    }
}
