package com.xworkz.application.train;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Train {
    private  int id;
    private String trainName;
    private String line;
    private int numOfCoaches;
    @Override
    public String toString(){
        return "Train(id="+this.id+", trainName="+this.trainName+", line="+this.line+", numOfCoaches="+this.numOfCoaches+")";
    }
    @Override
    public int hashCode(){
        return this.id;
    }

    @Override
    public boolean equals(Object obj){
        Train train= (Train) obj;
        if(this.hashCode()==train.hashCode())
            return true;
        return false;

    }

}

 /*
 String methods
 split method
 override equals and hashcode()
 bit shift
 // equality contract
 equals(){
    hashcode()
 }
  */