package com.xworkz.instituteapp.exception;

public class EmailNotFoundByIdException extends Exception{
    public EmailNotFoundByIdException(String errorMessage) {
        super(errorMessage);
    }
}
