package com.xworkz.libraryapp.exception;

public class IdNotFoundToUpdateAuthorException extends RuntimeException{
    public IdNotFoundToUpdateAuthorException(String errorMessage) {
        super(errorMessage);
    }
}
