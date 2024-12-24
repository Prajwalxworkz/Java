package com.xworkz.parentapp;

import com.xworkz.parentapp.child.Child;
import com.xworkz.parentapp.parent.Parent;

public class ParentRunner {
    public static void main(String[] args) {
        Parent parent = new Child() ;
        parent.business();
    }
}
