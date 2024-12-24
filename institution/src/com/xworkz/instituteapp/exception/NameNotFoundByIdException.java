package com.xworkz.instituteapp.exception;

public class NameNotFoundByIdException extends Exception{
    public NameNotFoundByIdException(String errorMessage) {
        super(errorMessage);
    }
}
