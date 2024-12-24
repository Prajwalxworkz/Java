package com.xworkz.calenderapp.exception;

public class EventNotFoundByWhoException extends RuntimeException{
    public EventNotFoundByWhoException(String errorMessage){
        super(errorMessage);
    }
}
