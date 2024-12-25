package com.xworkz.fundamentals;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetRunner {
    public static void main(String[] args) {
        //HashSet, LinkedHashSet, TreeSet are the implementation classes which implements Set
        //LinkedHashSet is a subclass (extends) of HashSet and implements Set
        //TreeSet implements NavigableSet which in turn extends SortedSet

        
        Collection collection1=new HashSet<>(); //It accepts heterogenous values and displays values randomly
        collection1.add(11);
        collection1.add(23);
        collection1.add(2);
        collection1.add("we");
        collection1.add(7877);
        collection1.add('a');
        collection1.add(1.1);
        collection1.add(232);
        collection1.add(1.0d);
        collection1.add(8.9f);
        System.out.println(collection1);
        System.out.println("size:"+collection1.size());
        System.out.println("---------------------------");

        Collection collection2=new LinkedHashSet(); //It accepts heterogenous values and displays values in the order of insertion
        collection2.add(11);
        collection2.add(23);
        collection2.add(2);
        collection2.add("we");
        collection2.add(7877);
        collection2.add('a');
        collection2.add(1.1);
        collection2.add(232);
        collection2.add(1.0d);
        collection2.add(8.9f);
        System.out.println(collection2);
        System.out.println("size:"+collection2.size());
        System.out.println("---------------------------");

        Collection collection3=new TreeSet(); //It accepts homogenous values and displays it in sorted order(ascending order)
        collection3.add(11);
        collection3.add(23);
        collection3.add(2);
        collection3.add(7877);
        collection3.add(4);
        collection3.add(45);
        collection3.add(32);
        collection3.add(66);
        collection3.add(4);
        System.out.println(collection3);
        System.out.println("size:"+collection3.size());


    }
}
