package com.xworkz.fundamentals.custom;

import java.util.ArrayList;
import java.util.Collection;

public class ChessRunner {
    public static void main(String[] args) {
        Chess chess=new Chess(1, "Arjun Erigaisi", 2801);
        Chess chess1=new Chess(2, "Gukesh D", 2783);
        Chess chess2=new Chess(3, "Vishwanathan Anand", 2751);
        Chess chess3=new Chess(4, "Praggnanandhaa R", 2737);

        Collection collection=new ArrayList();

        collection.add(chess);
        collection.add(chess1);
        collection.add(chess2);
        collection.add(chess3);
        collection.add(new Chess(5, "Vidit Gujrathi", 2726));

        Collection collection1= new ArrayList<>();
        Chess chess4=new Chess(4, "Praggnanandhaa R", 2737);
        collection1.add(new Chess(1, "Magnus Carlsen", 2831));
        collection1.add(new Chess(2, "Fabiano Caruana", 2805));
        collection1.add(new Chess(3, "Hikaru Nakamura", 2802));
        collection1.add(chess4);

        collection1.addAll(collection);
      //  System.out.println(collection);
        collection.forEach(System.out::println);
        int size=collection.size();
        System.out.println("The size is "+size);
        System.out.println("------------------------------------------------------");
        collection1.forEach(System.out::println);
        int size1=collection1.size();
        System.out.println("The size is "+size1);
        System.out.println("========================================================");


        boolean isPlayerRemoved=collection.remove(chess2);
        System.out.println("Is the player from collection removed: "+isPlayerRemoved);
        System.out.println("-----------");
        collection.forEach(System.out::println);
        System.out.println("The size is "+collection.size());
        System.out.println("------------------------------------------------------");
        collection1.forEach(System.out::println);
        System.out.println("The size is "+collection1.size());
        System.out.println("========================================================");


        boolean isAllObjectsInCollectionRemoved=collection.removeAll(collection);
        System.out.println("Is the collection retained: "+isAllObjectsInCollectionRemoved);
        System.out.println("-----------");
        collection.forEach(System.out::println);
        System.out.println("The size is "+collection.size());
        System.out.println("------------------------------------------------------");
        collection1.forEach(System.out::println);
        System.out.println("The size is "+collection1.size());
        System.out.println("========================================================");

        boolean isCollectionRetained=collection.retainAll(collection1);
        System.out.println("Is the collection retained: "+isCollectionRetained);
        System.out.println("-----------");
        collection.forEach(System.out::println);
        System.out.println("The size is "+collection.size());
        System.out.println("========================================================");

        collection1.forEach(System.out::println);
        System.out.println("The size is "+collection1.size());
        System.out.println("========================================================");


        boolean isCollection1Retained=collection1.retainAll(collection);
        System.out.println("Is the collection retained: "+isCollection1Retained);
        System.out.println("-----------");
        collection1.forEach(System.out::println);
        System.out.println("The size is "+collection1.size());
        System.out.println("------------------------------------------------------");
        collection.forEach(System.out::println);
        System.out.println("The size is "+collection.size());



    }
}
