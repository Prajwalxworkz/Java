package com.google.gmailapp.exception;

public class SubjectNotFoundToUpdateBodyException extends RuntimeException{
    public SubjectNotFoundToUpdateBodyException(String errorMessage) {
        super(errorMessage);
    }
}
