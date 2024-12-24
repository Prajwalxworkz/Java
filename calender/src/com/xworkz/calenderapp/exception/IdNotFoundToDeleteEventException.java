package com.xworkz.calenderapp.exception;

public class IdNotFoundToDeleteEventException extends RuntimeException{
    public IdNotFoundToDeleteEventException(String errorMessage) {
        super(errorMessage);
    }
}
