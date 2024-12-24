package com.xworkz.calenderapp.exception;

public class WhoNotFoundByStartDateException extends RuntimeException{
    public WhoNotFoundByStartDateException(String errorMessage){
        super(errorMessage);
    }
}
