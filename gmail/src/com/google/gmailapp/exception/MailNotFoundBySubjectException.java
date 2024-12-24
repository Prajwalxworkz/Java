package com.google.gmailapp.exception;

public class MailNotFoundBySubjectException extends RuntimeException{
    public MailNotFoundBySubjectException(String errorMessage) {
        super(errorMessage);
    }
}
