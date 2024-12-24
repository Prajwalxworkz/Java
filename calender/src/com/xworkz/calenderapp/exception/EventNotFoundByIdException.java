package com.xworkz.calenderapp.exception;

public class EventNotFoundByIdException extends RuntimeException{
    public EventNotFoundByIdException(String errorMessage){
        super(errorMessage);
    }
}
