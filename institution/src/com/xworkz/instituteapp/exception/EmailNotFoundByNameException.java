package com.xworkz.instituteapp.exception;

public class EmailNotFoundByNameException extends Exception{
    public EmailNotFoundByNameException(String errorMessage) {
        super(errorMessage);
    }
}
