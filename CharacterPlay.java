package com.xworkz.fundamentals.primitive;

import java.util.ArrayList;
import java.util.Collection;

public class CharacterPlay {
    public static void main(String[] args) {
        Collection collection1=new ArrayList<>();
        collection1.add('a');
        collection1.add('e');
        collection1.add('i');
        collection1.add('o');
        collection1.add('u');
        System.out.println("The size of collection1 is "+collection1.size());
        System.out.println("Elements of collection1 are : ");
        System.out.println(collection1);
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||");
        Collection collection2= new ArrayList<>();
        collection2.add('x');
        collection2.add('w');
        collection2.add('o');
        collection2.add('r');
        collection2.add('k');
        collection2.add('z');
        System.out.println("The size of collection2 is "+collection2.size());
        System.out.println("Elements of collection2 are : ");
        System.out.println(collection2);
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||");
        Collection collection3=new ArrayList<>();
        collection3.add('e');
        collection3.add('d');
        collection3.add('u');
        collection3.add('c');
        collection3.add('a');
        collection3.add('t');
        collection3.add('i');
        collection3.add('o');
        collection3.add('n');
        System.out.println("The size of collection3 is "+collection3.size());
        System.out.println("Elements of collection3 are : ");
        System.out.println(collection3);
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("Does collection1 contains all elements of collection1: "+collection1.containsAll(collection1));
        System.out.println("Does collection2 contains all elements of collection1: "+collection2.containsAll(collection1));
        System.out.println("Does collection3 contains all elements of collection1: "+collection3.containsAll(collection1));
        System.out.println("Does collection1 contain char 'a' in its list: "+collection1.contains('a'));
        System.out.println("Does collection2 contain char 'a' in its list: "+collection2.contains('a'));
        System.out.println("Does collection3 contain char 'a' in its list: "+collection3.contains('a'));
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||");
        collection2.remove('x');
        System.out.println("The size of collection2 is "+collection1.size());
        System.out.println("Elements of collection2 are : ");
        System.out.println(collection2);
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("Is collection1 added to collection2 "+collection2.addAll(collection1));
        System.out.println("The size of collection2 is "+collection2.size());
        System.out.println("Elements of collection2 are : ");
        System.out.println(collection2);
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("Does collection1 contains all elements of collection1: "+collection1.containsAll(collection1));
        System.out.println("Does collection2 contains all elements of collection1: "+collection2.containsAll(collection1));
        System.out.println("Does collection3 contains all elements of collection1: "+collection3.containsAll(collection1));
    }
}
