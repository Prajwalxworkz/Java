package com.xworkz.calenderapp.exception;

public class WhoNotFoundToUpdateStartDateException extends RuntimeException{
    public WhoNotFoundToUpdateStartDateException(String errorMessage) {
        super(errorMessage);
    }
}
