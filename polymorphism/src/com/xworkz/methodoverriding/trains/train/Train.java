package com.xworkz.methodoverriding.trains.train;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Train {
    private  int trainNUmber;
    private  String source;
    private  String destination;


    public Train() {
        System.out.println("Trains are the fastest means of transport on road");
    }

    public void transport(){
        System.out.println("invoked train class method");
        System.out.println("Travelling long distance, within or between the cities");
    }

    public  void getTrainInfo(){
        System.out.println("Data: ");
        System.out.println("Train number: "+getTrainNUmber());
        System.out.println("Source: "+getSource());
        System.out.println("Destination: "+getDestination());
    }


}
