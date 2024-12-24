package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.library.CollegeLibrary;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerRunner {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of books to be added: ");
        int size=s.nextInt();
        CollegeLibrary collegeLibrary=new CollegeLibrary(size);

        for(int start =0;start<size;start++){
            Book book=new Book();
            System.out.println("Enter the book id:");
            int bookId=s.nextInt();
            book.setBookId(bookId);
            System.out.println("Enter the book name:");
            s.nextLine();
            String bookName=s.nextLine();
            book.setName(bookName);
            System.out.println("Enter the author name:");
            String authorName=s.nextLine();
            book.setAuthor(authorName);
            System.out.println("Enter the book price:");
            double price= s.nextDouble();
            book.setAmount(price);
            collegeLibrary.addBook(book);
           // System.out.println(book);
            System.out.println("================================");
        }

        collegeLibrary.getAllBookDetails();
    }
}
