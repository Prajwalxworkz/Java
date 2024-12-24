package com.xworkz.libraryapp.exception;

public class AuthorNotFoundByBookNameException extends RuntimeException{
    public AuthorNotFoundByBookNameException(String errorMessage) {
        super(errorMessage);
    }
}
