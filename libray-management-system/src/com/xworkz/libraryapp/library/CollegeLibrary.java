package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.exception.*;

import java.util.Arrays;

public class CollegeLibrary implements Library {
    Book book[]=null;
    public CollegeLibrary(int size){
        book=new Book[size];
    }
     int index=0;
    public void addBook(Book book){
       // boolean isBookAdded=false;
        if(book!=null){
            if(book.getBookId()>0 && book.getName()!=null){
                this.book[index++]=book;
            }
        }
        else {
            System.out.println("Book fields are empty");
        }
      //  return isBookAdded;
    }

    public void getAllBookDetails() {
        for(Book book:book){
            System.out.println(book);
        }
    }

    @Override
    public void getReturnedBookDetails(Book book) {
        System.out.println(book);
    }

    @Override
    public Book getBookById(int id) {
        Book returnedBook=null;
        try {
            for (Book book : book) {
                if (id == book.getBookId()) {
                    returnedBook = book;
                }
            }
            if (returnedBook == null)
            {
                BookNotFoundByIdException bookNotFoundByIdException = new BookNotFoundByIdException("Mentioned id "+id+" is not found");
                throw bookNotFoundByIdException;
            }
        }catch (BookNotFoundByIdException e){
            e.printStackTrace();
        }
        return returnedBook;
    }

    @Override
    public Book getBookByPrice(double price) {
        Book returnedBook=null;
        try {
            for (Book book : book) {
                if (price == book.getAmount()) {
                    returnedBook = book;
                }
            }
            if (returnedBook == null)
            {
                BookNotFoundByPriceException bookNotFoundByPriceException= new BookNotFoundByPriceException("Mentioned book price "+price+" is not found");
                throw bookNotFoundByPriceException;
            }
        }catch (BookNotFoundByPriceException e){
            e.printStackTrace();
        }
        return returnedBook;
    }

    @Override
    public Book getBookByAuthor(String author) {
        Book returnedBook=null;
        try {
            for (Book book : book) {
                if (author.equals(book.getAuthor())) {
                    returnedBook = book;
                }
            }
            if (returnedBook == null)
            {
                BookNotFoundByAuthorException bookNotFoundByAuthorException=new BookNotFoundByAuthorException("Mentioned author "+author+" is not found");
                throw bookNotFoundByAuthorException;
            }
        }catch (BookNotFoundByAuthorException e){
            e.printStackTrace();
        }
        return returnedBook;
    }

    @Override
    public String getAuthorByBookName(String bookName) {
        String author=null;
        try {
            for (Book book : this.book) {
                if (bookName.equals(book.getAuthor())) {
                    author = book.getAuthor();
                }
            }
            if (author == null)
            {

                AuthorNotFoundByBookNameException authorNotFoundByBookNameException= new AuthorNotFoundByBookNameException("Mentioned book name "+bookName+"is not found");
                throw authorNotFoundByBookNameException;
            }
        }catch (AuthorNotFoundByBookNameException e){
            e.printStackTrace();
        }
        return author;
    }

    @Override
    public boolean updatePriceById(double updatedPrice, int id) {
        boolean isPriceUpdated=false;
        try {
            for (Book book : book) {
                if (id == book.getBookId()) {
                    book.setAmount(updatedPrice);
                    isPriceUpdated = true;
                }
            }
            if (isPriceUpdated == false)
            {
                IdNotFoundToUpdatePriceException idNotFoundToUpdatePriceException=new IdNotFoundToUpdatePriceException("Mentioned id "+id+" is not found");
                throw idNotFoundToUpdatePriceException;
            }
        }catch (IdNotFoundToUpdatePriceException e){
            e.printStackTrace();
        }
        return isPriceUpdated;
    }

    @Override
    public boolean updateAuthorById(String updatedAuthor, int id) {
        boolean isAuthorUpdated=false;
        try {
            for (Book book : book) {
                if (id == book.getBookId()) {
                    book.setAuthor(updatedAuthor);
                    isAuthorUpdated = true;
                }
            }
            if (isAuthorUpdated == false)
            {
                IdNotFoundToUpdateAuthorException idNotFoundToUpdateAuthorException=new IdNotFoundToUpdateAuthorException("Mentioned id "+id+" is not found");
                throw idNotFoundToUpdateAuthorException;
            }
        }catch (IdNotFoundToUpdateAuthorException e){
            e.printStackTrace();
        }
        return isAuthorUpdated;
    }

    @Override
    public boolean updateBookNameById(String updatedBookName, int id) {
        boolean isBookNameUpdated=false;
        try {
            for (Book book : book) {
                if (id == book.getBookId()) {
                    book.setName(updatedBookName);
                    isBookNameUpdated = true;
                }
            }
            if (isBookNameUpdated == false) {
                IdNotFoundToUpdateBookNameException idNotFoundToUpdateBookNameException=new IdNotFoundToUpdateBookNameException("Mentioned id "+id+" is not found");
                throw idNotFoundToUpdateBookNameException;
            }
        }catch (IdNotFoundToUpdateBookNameException e){
            e.printStackTrace();
        }
        return isBookNameUpdated;
    }

    @Override
    public boolean updateBookNameByAuthor(String updatedBookName, String author) {
        boolean isBookNameUpdated =false;
        try {
            for (Book book : book) {
                if (author.equals(book.getAuthor())) {
                    book.setName(updatedBookName);
                    isBookNameUpdated = true;
                }
            }
            if (isBookNameUpdated == false)
            {
                AuthorNotFoundToUpdateBookNameException authorNotFoundToUpdateBookNameException =new AuthorNotFoundToUpdateBookNameException("Mentioned author "+author+" is not found");
                throw authorNotFoundToUpdateBookNameException;
            }
        }catch (AuthorNotFoundToUpdateBookNameException e){
            e.printStackTrace();
        }
        return isBookNameUpdated ;
    }

    @Override
    public boolean deleteBookById(int id) {
        boolean isBookDeleted=false;
        int initial, size;
        try{
        for( initial=0,size=0;initial<book.length;initial++){
            if(id!=book[initial].getBookId()){
                book[size++]=book[initial];
            }else isBookDeleted=true;
        }
        if(isBookDeleted==false){
            IdNotFoundToDeleteBookException idNotFoundToDeleteBookException=new IdNotFoundToDeleteBookException("Mentioned id "+id+" is not found");
            throw idNotFoundToDeleteBookException;
        }
        book= Arrays.copyOf(book, size);
        }catch (IdNotFoundToDeleteBookException e){
            e.printStackTrace();
        }
        return isBookDeleted;
    }

}
