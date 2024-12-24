package com.xworkz.bookingapp.trainlist;

import com.xworkz.bookingapp.trains.Trains;

public class TrainList extends Trains {
    Trains train;
    public void addTrain(Trains train){
        if(train!=null){
            this.train=train;
        }
    }
public void getTrains(){
    System.out.println("Train number: "+getTrainNumber());
    System.out.println("Train name: "+getTrainName());
    System.out.println("from: "+getFrom());
    System.out.println("to: "+getTo());
}
}
