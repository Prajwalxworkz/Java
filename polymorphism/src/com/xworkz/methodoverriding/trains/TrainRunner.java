package com.xworkz.methodoverriding.trains;

import com.xworkz.methodoverriding.trains.metrotrain.MetroTrain;
import com.xworkz.methodoverriding.trains.suburbantrain.SubUrbanTrain;
import com.xworkz.methodoverriding.trains.train.Train;

public class TrainRunner {
    public static void main(String[] args) {
        Train train2 = new Train();
        train2.transport();
        train2.setTrainNUmber(655515);
        train2.setSource("Mumbai");
        train2.setDestination("Bengaluru");
        train2.getTrainInfo();
        System.out.println("--------------------------");
        System.out.println("--------------------------");

        Train train = new MetroTrain();
        train.transport();
        train.setTrainNUmber(65052);
        train.setSource("Benniganahalli");
        train.setDestination("Shree Balagangadharanatha Swamiji Station, Hosalli");
        train.getTrainInfo();
        System.out.println("--------------------------");
        MetroTrain metroTrain = new MetroTrain();
        metroTrain.transport();
        train2.setTrainNUmber(655515);
        train2.setSource("Mumbai");
        train2.setDestination("Bengaluru");
        train2.getTrainInfo();
        System.out.println("--------------------------");
        System.out.println("--------------------------");

        Train train1 = new SubUrbanTrain();
        train1.transport();
        train1.setTrainNUmber(65015);
        train1.setSource("Alur");
        train1.setDestination("Bengaluru");
        train1.getTrainInfo();
        System.out.println("--------------------------");
        SubUrbanTrain subUrbanTrain = new SubUrbanTrain();
        subUrbanTrain.transport();  train1.transport();
        subUrbanTrain.setTrainNUmber(65015);
        subUrbanTrain.setSource("Alur");
        subUrbanTrain.setDestination("Bengaluru");
        subUrbanTrain.getTrainInfo();
    }
}
