package com.xworkz.libraryapp.exception;

public class IdNotFoundToUpdatePriceException extends RuntimeException{
    public IdNotFoundToUpdatePriceException(String errorMessage) {
        super(errorMessage);
    }
}
