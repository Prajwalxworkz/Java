package com.google.gmailapp.exception;

public class MailNotFoundByToException extends RuntimeException{
    public MailNotFoundByToException(String errorMessage) {
        super(errorMessage);
    }
}
