package com.xworkz.libraryapp.book;

import lombok.*;

import javax.security.auth.login.CredentialException;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Book implements Cloneable{
    private int bookId;
    private String name;
    private String author;
    private double amount;
@Override
    public String toString(){
        return "Book-(bookId="+this.bookId+", name="+this.name+" , author="+this.author+", amount="+this.amount+")";
    }
    @Override
    public int hashCode(){
        return this.bookId;
    }
    @Override
    public boolean equals(Object obj){
        Book book=(Book)obj;
        if(this.hashCode()==book.hashCode() && this.name==book.name && this.author==book.author && this.amount==book.amount )
            return true;
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}