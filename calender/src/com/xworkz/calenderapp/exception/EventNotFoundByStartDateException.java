package com.xworkz.calenderapp.exception;

public class EventNotFoundByStartDateException extends Exception{
    public EventNotFoundByStartDateException(String errorMessage) {
        super(errorMessage);
    }
}
