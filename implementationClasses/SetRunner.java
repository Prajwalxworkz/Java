package com.xworkz.fundamentals;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetRunner {
    public static void main(String[] args) {
        Collection collection1=new HashSet<>();
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

        Collection collection2=new LinkedHashSet();
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

        Collection collection3=new TreeSet();
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
