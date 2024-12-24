package com.xworkz.libraryapp.exception;

public class IdNotFoundToDeleteBookException extends RuntimeException{
    public IdNotFoundToDeleteBookException(String errorMessage) {
        super(errorMessage);
    }
}
