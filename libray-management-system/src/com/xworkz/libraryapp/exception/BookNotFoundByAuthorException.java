package com.xworkz.libraryapp.exception;

public class BookNotFoundByAuthorException extends RuntimeException{
    public BookNotFoundByAuthorException(String errorMessage) {
        super(errorMessage);
    }
}
