package com.xworkz.libraryapp.exception;

public class IdNotFoundToUpdateBookNameException extends RuntimeException{
    public IdNotFoundToUpdateBookNameException(String errorMessage) {
        super(errorMessage);
    }
}
