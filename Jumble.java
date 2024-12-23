package com.xworkz.fundamentals.mixedtype;

import java.util.ArrayList;
import java.util.Collection;

public class Jumble {
    public static void main(String[] args) {
        Collection collection1=new ArrayList<>();
        collection1.add(1);
        collection1.add(2);

        Collection collection2=new ArrayList<>();
        collection2.add(1.0);
        collection2.add(2.0);

        Collection collection3=new ArrayList<>();
        collection3.add('1');
        collection3.add('2');

        Collection collection4=new ArrayList<>();
        collection4.add("1");
        collection4.add("2");

        Collection collection5=new ArrayList<>();
        collection5.addAll(collection1);
        collection5.addAll(collection2);
        collection5.addAll(collection3);
        collection5.addAll(collection4);

        System.out.println("The size of collection1 is "+collection1.size());
        System.out.println("The elements of collection1 are: ");
        System.out.println(collection1);
        System.out.println("--------------------------");
        System.out.println("The size of collection2 is "+collection2.size());
        System.out.println("The elements of collection2 are: ");
        System.out.println(collection2);
        System.out.println("--------------------------");
        System.out.println("The size of collection3 is "+collection3.size());
        System.out.println("The elements of collection3 are: ");
        System.out.println(collection3);
        System.out.println("--------------------------");
        System.out.println("The size of collection4 is "+collection4.size());
        System.out.println("The elements of collection4 are: ");
        System.out.println(collection4);
        System.out.println("--------------------------");
        System.out.println("The size of collection5 is "+collection5.size());
        System.out.println("The elements of collection5 are: ");
        System.out.println(collection5);
        System.out.println("||||||||||||||||||||||||||||||||||");
        System.out.println("Does collection2 contains all elements of collection1: "+collection2.containsAll(collection1));
        System.out.println("Does collection3 contains all elements of collection1: "+collection3.containsAll(collection1));
        System.out.println("Does collection4 contains all elements of collection1: "+collection4.containsAll(collection1));
        System.out.println("Does collection5 contains all elements of collection1: "+collection5.containsAll(collection1));
        System.out.println("||||||||||||||||||||||||||||||||||");
        System.out.println("Does collection1 contain int '1' in its list: "+collection1.contains(1));
        System.out.println("Does collection1 contain double '1' in its list: "+collection1.contains(1.0d));
        System.out.println("Does collection1 contain float '1' in its list: "+collection1.contains(1.0f));
        System.out.println("||||||||||||||||||||||||||||||||||");
        System.out.println("Does collection5 contain int '1' in its list: "+collection5.contains(1));
        System.out.println("Does collection5 contain double '1' in its list: "+collection5.contains(1.0d));
        System.out.println("Does collection5 contain float '1' in its list: "+collection5.contains(1.0f));
        System.out.println("Does collection5 contain char '1' in its list: "+collection5.contains('1'));
        System.out.println("Does collection5 contain String '1' in its list: "+collection5.contains("1"));
        System.out.println("||||||||||||||||||||||||||||||||||");
        System.out.println("Is collection2 deleted: "+collection2.removeAll(collection2));
        System.out.println("Is '1' deleted from collection5: "+collection5.remove('1'));
        System.out.println("The size of collection5 is "+collection5.size());
        System.out.println("Elements of collection5 are : ");
        System.out.println(collection5);
    }
}
