package com.google.gmailapp.exception;

public class IdNotFoundToUpdateSubjectException extends RuntimeException{
    public IdNotFoundToUpdateSubjectException(String errorMessage) {
        super(errorMessage);
    }
}
