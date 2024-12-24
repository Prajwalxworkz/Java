package com.google.gmailapp.exception;

public class MailNotFoundByBodyException extends  RuntimeException{
    public MailNotFoundByBodyException(String errorMessage) {
        super(errorMessage);
    }
}
