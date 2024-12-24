package com.google.gmailapp.exception;

public class MailNotFoundByFromException extends RuntimeException{
    public MailNotFoundByFromException(String errorMessage) {
        super(errorMessage);
    }
}
