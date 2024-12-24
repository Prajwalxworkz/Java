package com.xworkz.calenderapp.exception;

public class EventNotFoundByEventTypeException extends RuntimeException{
    public EventNotFoundByEventTypeException(String errorMessage) {
        super(errorMessage);
    }
}
