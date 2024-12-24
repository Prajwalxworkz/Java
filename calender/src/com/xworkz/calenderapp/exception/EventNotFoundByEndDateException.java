package com.xworkz.calenderapp.exception;

public class EventNotFoundByEndDateException extends RuntimeException{
    public EventNotFoundByEndDateException(String errorMessage) {
        super(errorMessage);
    }
}
