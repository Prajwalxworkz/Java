package com.xworkz.calenderapp.exception;

public class DisplayEventDetailsException extends RuntimeException{
    public DisplayEventDetailsException(String errorMessage){
        System.out.println(errorMessage);
    }
}
