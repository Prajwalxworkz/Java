package com.xworkz.application.nammametro;

import com.xworkz.application.train.Train;

public class NammaMetro {
    //has-a-relationship
    Train train;
    public boolean addTrain(Train train){
        boolean isTrainAdded=false;
        if(train!=null){
            if(train.getId()>0 && train.getTrainName()!=null){
                this.train=train;
                isTrainAdded=true;
            }
        }else{
            System.out.println("Train fields are empty");
        }
        return isTrainAdded;
    }

    public void getTrainInfo(){
        System.out.println("id: " +train.getId());
        System.out.println("name: " +train.getTrainName());
        System.out.println("line: " +train.getLine());
        System.out.println("nummer of coaches: " +train.getNumOfCoaches());
    }
}
