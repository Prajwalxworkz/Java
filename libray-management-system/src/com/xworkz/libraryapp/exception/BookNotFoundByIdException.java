package com.xworkz.libraryapp.exception;

public class BookNotFoundByIdException extends RuntimeException {
    public BookNotFoundByIdException(String errorMessage) {
        super(errorMessage);
    }
}
