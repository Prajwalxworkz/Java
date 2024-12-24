package com.xworkz.libraryapp;

public class ExceptionRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        String st="7019592866 ";
       // long value = Long.parseLong(st);
        try {
            long value = Long.parseLong(st);
            System.out.println("The value is "+value);
        }catch (NumberFormatException e){
            System.out.println("Check the value provided to the string reference");
        }
      //  System.out.println("The value is "+value);

        System.out.println("main ended");
    }
}
