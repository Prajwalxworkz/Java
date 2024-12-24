package com.xworkz.methodoverriding.trains.metrotrain;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import com.xworkz.methodoverriding.trains.train.Train;

public class   MetroTrain extends Train {
    public MetroTrain() {
        System.out.println("Namma Metro");
    }

    @Override
    public  void transport(){
        System.out.println("invoked metro class method");
        System.out.println("Travelling within the city");
    }

}
