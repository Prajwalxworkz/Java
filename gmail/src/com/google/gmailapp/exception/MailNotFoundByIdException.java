package com.google.gmailapp.exception;

public class MailNotFoundByIdException extends RuntimeException{
    public MailNotFoundByIdException(String errorMessage) {
        super(errorMessage);
    }
}
