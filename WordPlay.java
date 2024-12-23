package com.xworkz.fundamentals.nonprimitive;

import java.util.ArrayList;
import java.util.Collection;

public class WordPlay {
    public static void main(String[] args) {
        Collection collection1=new ArrayList<>();
        collection1.add("Tomorrow there is");
        collection1.add("a");
        collection1.add("mock interview");
        collection1.add("Topics are");
        collection1.add("Java");
        collection1.add("Web Technologies");
        collection1.add("SQL");
        collection1.add("JDBC");
        System.out.println("Is the collection1 added in collection1: "+collection1.addAll(collection1));
      //  System.out.println("Is the collection1 removed from collection1: "+collection1.removeAll(collection1));
        System.out.println("The elements of collection1 are: ");
        collection1.forEach(System.out::println);
        System.out.println("The size of collection1 is "+collection1.size());

        System.out.println("-------------------------------------------------");

        Collection collection2=new ArrayList<>();
        collection2.add("Interview is at 2 pm");
        collection2.add("Panel is not yet decided");
        collection2.add("May be Harish sir or Balu sir");
        collection2.add('a');
        System.out.println("The elements of collection2 are: ");
        collection2.forEach(System.out::println);
        System.out.println("The size of collection2 is "+collection2.size());
        System.out.println("-------------------------------------------------");
/*
        System.out.println("Is the collection1 removed from collection1 : "+collection1.removeAll(collection1));
        collection1.forEach(System.out::println);
        System.out.println("The size of collection1 is "+collection1.size());
        System.out.println("-------------------------------------------------");
*/

        collection2.addAll(collection1);
        collection2.forEach(System.out::println);
        System.out.println("The size of collection2 is "+collection2.size());
        System.out.println("-------------------------------------------------");

        System.out.println("Is the collection1 removed from collection2 : "+collection2.removeAll(collection1));
        collection2.forEach(System.out::println);
        System.out.println("The size of collection2 is "+collection2.size());
        System.out.println("-------------------------------------------------");

        collection1.forEach(System.out::println);
        System.out.println("The size of collection1 is "+collection2.size());
        System.out.println("------------");
        collection2.forEach(System.out::println);
        System.out.println("The size of collection2 is "+collection2.size());
        System.out.println("------------");
        System.out.println("Is 'string a' present in collection2: "+collection2.contains("a"));
        System.out.println("Is 'char a' present in collection2: "+collection2.contains('a'));
        System.out.println("---------------------------------------------------");


        Collection collection3=new ArrayList<>();
        collection3.add("a");

        System.out.println("Does collection2 contains all elements of collection3: "+collection2.containsAll(collection3));
        System.out.println("-------------------");
        System.out.println(collection3.containsAll(collection3));




    }
}
