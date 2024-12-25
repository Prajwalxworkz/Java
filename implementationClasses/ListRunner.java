package com.xworkz.fundamentals;

import java.util.*;

public class ListRunner {
    public static void main(String[] args) {
        Collection collection1=new ArrayList<>();
        collection1.add(11);
        collection1.add(23);
        collection1.add(2);
        collection1.add("we");
        collection1.add(7877);
        collection1.add("13");
        collection1.add("21");
        collection1.add("21");
        collection1.add("10");
        collection1.add("44");
        System.out.println(collection1);
        System.out.println("size:"+collection1.size());
        System.out.println("---------------------------");


        Collection collection2=new LinkedList();
        collection2.add(11);
        collection2.add(23);
        collection2.add(2);
        collection2.add("we");
        collection2.add(7877);
        collection2.add("13");
        collection2.add("21");
        collection2.add("21");
        collection2.add("10");
        collection2.add("44");
        System.out.println(collection2);
        System.out.println("size:"+collection2.size());
        System.out.println("---------------------------");

        Collection collection3=new Vector();
        collection3.add(11);
        collection3.add(23);
        collection3.add(2);
        collection3.add("we");
        collection3.add(7877);
        collection3.add("13");
        collection3.add("21");
        collection3.add("21");
        collection3.add("10");
        collection3.add("44");
        System.out.println(collection3);
        System.out.println("size:"+collection3.size());
        System.out.println("---------------------------");

        Collection collection4=new Stack();
        collection4.add(11);
        collection4.add(23);
        collection4.add(2);
        collection4.add("we");
        collection4.add(7877);
        collection4.add("13");
        collection4.add("21");
        collection4.add("21");
        collection4.add("10");
        collection4.add("44");
        System.out.println(collection4);
        System.out.println("size:"+collection4.size());
        System.out.println("---------------------------");
    }
}
