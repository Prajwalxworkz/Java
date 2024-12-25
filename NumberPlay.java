package com.xworkz.fundamentals.primitive;

import java.util.ArrayList;
import java.util.Collection;

public class NumberPlay {
    public static void main(String[] args) {
        Collection collection1=new ArrayList();
        collection1.add(2);
        collection1.add(4);
        collection1.add(15);
        collection1.add(16);
        collection1.add(21);

        Collection collection2=new ArrayList();
        collection2.add(2);
        collection2.add(3);
        collection2.add(5);
        collection2.add(11);
        collection2.add(19);
        System.out.println("The elements of collection1 are: ");
        System.out.println(collection1);
        System.out.println("The size of collection1 is "+collection1.size());
        System.out.println("The elements of collection2 are: ");
        System.out.println(collection2);
        System.out.println("The size of collection2 is "+collection2.size());

        collection1.retainAll(collection2);
        System.out.println("The elements of collection1 are: ");
        System.out.println(collection1);
        System.out.println("The size of collection1 is "+collection1.size());

        collection2.addAll(collection1);
        System.out.println("The elements of collection2 are: ");
        System.out.println(collection2);
        System.out.println("The size of collection2 is "+collection2.size());
        System.out.println("----------------------------------------------");

        System.out.println("Is '2' present in collection2: "+collection2.contains(2));
        System.out.println("---------------------------------------------");

        System.out.println("Is 4 deleted: "+collection1.remove(4));
        System.out.println(collection1);
        System.out.println("The size of collection1 is "+collection1.size());
        System.out.println(collection2.remove(3));
        System.out.println(collection2);
        System.out.println("The size of collection2 is "+collection2.size());
        System.out.println("==================================================");
        collection2.retainAll(collection1);
        System.out.println(collection2);
        System.out.println(collection1);
        System.out.println("The size of collection2 is "+collection2.size());

        System.out.println("Does collection2 has all elements of collection1: "+collection2.containsAll(collection1));

 /*
        collection1.clear();
        System.out.println(collection1);
        System.out.println("The size of collection 1 is "+collection1.size());
        System.out.println(collection2);
        System.out.println("The size of collection 1 is "+collection2.size());
        System.out.println("==================================================");
      */
    }
}
