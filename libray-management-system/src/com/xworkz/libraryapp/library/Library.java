package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.book.Book;

public interface Library {
    public void addBook(Book book);
    public void getAllBookDetails();
    public void getReturnedBookDetails(Book book);
    public Book getBookById(int id);
    public Book getBookByPrice(double price);
    public Book getBookByAuthor(String author);
    public String getAuthorByBookName(String book);
    public boolean updatePriceById(double updatedPrice, int id);
    public boolean updateAuthorById(String updatedAuthor, int id);
    public boolean updateBookNameById(String updatedBookName, int id);
    public boolean updateBookNameByAuthor(String updatedBookName, String author );
    public boolean deleteBookById(int id);
}
