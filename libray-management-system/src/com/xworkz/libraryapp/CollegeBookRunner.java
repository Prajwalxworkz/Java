package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.library.CollegeLibrary;
import com.xworkz.libraryapp.library.Library;

import java.sql.Wrapper;
import java.util.Scanner;

public class CollegeBookRunner extends Book{
    public static void main(String[] args) {
        System.out.println("main started");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of books to be added: ");
        int size=s.nextInt();
        Library  collegeLibrary= new CollegeLibrary(size);
        for(int i=0;i<size;i++){
            Book book=new Book();
            System.out.println("Enter the book id:");
            book.setBookId(s.nextInt());
            System.out.println("Enter the author:");
            s.nextLine();
            book.setAuthor(s.nextLine());
            System.out.println("Enter the book name: ");
            s.nextLine();
            book.setName(s.nextLine());
            System.out.println("Enter the price: ");
            book.setAmount(s.nextDouble());
            collegeLibrary.addBook(book);
        }

        String input=null;
        do{
            System.out.println("Press 1 to read all book details");
            System.out.println("Press 2 to get book details based on id");
            System.out.println("Press 3 to get book details based on price");
            System.out.println("Press 4 to get book details based on author");
            System.out.println("Press 5 to get author  based on book name");
            System.out.println("Press 6 to edit book price based on id");
            System.out.println("Press 7 to edit book name based on author");
            System.out.println("Press 8 to update author based on id");
            System.out.println("Press 9 to edit book name based on id");
            System.out.println("Press 10 to delete book based on id");
            int option=s.nextInt();
            switch (option){
                case 1: collegeLibrary.getAllBookDetails();
                         break;
                case 2:
                    System.out.println("Enter the id: ");
                    Book returnedBookById= collegeLibrary.getBookById(s.nextInt());
                    collegeLibrary.getReturnedBookDetails(returnedBookById);
                    break;
                case 3:
                    System.out.println("Enter the price:");
                    Book returnedBookByPrice = collegeLibrary.getBookByPrice(s.nextDouble());
                    collegeLibrary.getReturnedBookDetails(returnedBookByPrice);
                    break;
                case 4:
                    System.out.println("Enter the author:");
                    s.nextLine();
                    Book returnedBookByAuthor= collegeLibrary.getBookByAuthor(s.nextLine());
                    break;
                case 5:
                    System.out.println("Enter the book name:");
                    s.nextLine();
                    String returnedAuthorByBookName= collegeLibrary.getAuthorByBookName(s.nextLine());
                    System.out.println(returnedAuthorByBookName);
                    break;

                case 6:
                    System.out.println("Enter the id:");
                    int id=s.nextInt();
                    System.out.println("Enter the updated price:");
                    double updatedPrice=s.nextDouble();
                    boolean isPriceUpdated=collegeLibrary.updatePriceById(updatedPrice,id);
                    System.out.println("Is price updated: "+isPriceUpdated);
                    break;
                case 7:
                    System.out.println("Enter the author:");
                    s.nextLine();
                    String author=s.nextLine();
                    System.out.println("Enter the updatedBookName:");
                    s.nextLine();
                    String updatedBookName=s.nextLine();
                    boolean isBookNameUpdated= collegeLibrary.updateBookNameByAuthor(updatedBookName,author);
                    System.out.println("Is book name updated: "+isBookNameUpdated);
                    break;
                case 8:
                    System.out.println("Enter the id:");
                   int id1=s.nextInt();
                    System.out.println("Enter the updatedAuthor:");
                    s.nextLine();
                    String  updatedAuthor=s.nextLine();
                    boolean isAuthorUpdated= collegeLibrary.updateAuthorById(updatedAuthor,id1);
                    System.out.println("Is book name updated: "+isAuthorUpdated);
                    break;
                case 9:
                    System.out.println("Enter the id:");
                   int id2=s.nextInt();
                    System.out.println("Enter the updatedBookName:");
                    s.nextLine();
                    String updatedBookName1=s.nextLine();
                    boolean isBookNameUpdated1= collegeLibrary.updateBookNameById(updatedBookName1,id2);
                    System.out.println("Is book name updated: "+isBookNameUpdated1);
                    break;
                case 10:
                    System.out.println("Enter the book id: ");
                    boolean isBookDeleted= collegeLibrary.deleteBookById(s.nextInt());
                    System.out.println("Is book deleted: "+isBookDeleted);
                default:
                    System.out.println("Please enter the valid option");
            }
            System.out.println("Do you want to continue? Yes/No");
            input=s.next();
        }while(input.equalsIgnoreCase("Yes"));
        System.out.println("main ended");
    }


}
