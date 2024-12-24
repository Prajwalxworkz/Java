package com.xworkz.libraryapp.exception;

public class AuthorNotFoundToUpdateBookNameException extends RuntimeException{
    public AuthorNotFoundToUpdateBookNameException(String errorMessage) {
        super(errorMessage);
    }
}
