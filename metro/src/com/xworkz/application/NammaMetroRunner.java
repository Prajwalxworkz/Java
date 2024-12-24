package com.xworkz.application;

import com.xworkz.application.nammametro.NammaMetro;
import com.xworkz.application.train.Train;

import java.util.Scanner;

public class NammaMetroRunner {
    public static void main(String[] args) {
        NammaMetro nammaMetro = new NammaMetro();
        Train train = new Train();
        Scanner s= new Scanner(System.in);
       // System.out.println(train);
        System.out.println("Enter the id");
        int id=s.nextInt();
        train.setId(id);
        System.out.println("Enter the train name");
        s.nextLine();
        String name=s.nextLine();
        train.setTrainName(name);
        System.out.println("Enter the line");
        String line=s.next();
        train.setLine(line);
        System.out.println("Enter the number of coaches");
        int numOfCoaches=s.nextInt();
        train.setNumOfCoaches(numOfCoaches);
        System.out.println(train);

  /*      Train train1 = new Train();
        // System.out.println(train);
        train1.setId(165515);
        train1.setTrainName("Namma metro");
        train1.setLine("Purple");
        train1.setNumOfCoaches(10);
        System.out.println(train1);
        int hashCode=train.hashCode();
        System.out.println(hashCode);
        boolean equal=train.equals(train1);
        System.out.println(equal);



//        boolean isTrainAdded= nammaMetro.addTrain(train);
//        System.out.println("Is train added: "+isTrainAdded);
//        nammaMetro.getTrainInfo();
*/
    }
}
