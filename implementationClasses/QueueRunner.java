package com.xworkz.fundamentals;

import java.util.Collection;
import java.util.PriorityQueue;

public class QueueRunner {
    public static void main(String[] args) {
        Collection collection1=new PriorityQueue();
        try {
            collection1.add(11);
            collection1.add(23);
            collection1.add(2);
            collection1.add(1);
            collection1.add(1);
            collection1.add("13");
            collection1.add("21");
            collection1.add("10");
            collection1.add("44");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(collection1);
        System.out.println("size:"+collection1.size());
        System.out.println("---------------------------");

        Collection collection2=new PriorityQueue();
        try {
            collection2.add("a");
            collection2.add("23");
            collection2.add("b");
            collection2.add("7877");
            collection2.add("string");
            collection2.add(1.1);
            collection2.add(232);
            collection2.add(1.0d);
            collection2.add(8.9f);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(collection2);
        System.out.println("size:"+collection2.size());
        System.out.println("---------------------------");

        Collection collection=new PriorityQueue();
        collection.add(1);
        collection.add(1111);
        collection.add(1);
        collection.add(111);
        collection.add(1);
        System.out.println(collection);


    }
}
