package com.xworkz.libraryapp.exception;

public class BookNotFoundByPriceException extends RuntimeException{
    public BookNotFoundByPriceException(String errorMessage) {
        super(errorMessage);
    }
}
