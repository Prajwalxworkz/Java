package com.xworkz.instituteapp.exception;

public class DobNotFoundByIdException extends Exception{
    public DobNotFoundByIdException(String errorMessage) {
        super(errorMessage);
    }
}
