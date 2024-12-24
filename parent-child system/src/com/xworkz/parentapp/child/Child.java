package com.xworkz.parentapp.child;

import com.xworkz.parentapp.parent.Parent;

public class Child extends Parent {
    public Child() {
        System.out.println("child constructor");
    }

    @Override
    public void business() {
        System.out.println("invoked business() from child");
        System.out.println("Nursing");
    }
}
