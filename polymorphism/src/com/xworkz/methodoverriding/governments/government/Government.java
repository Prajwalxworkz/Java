package com.xworkz.methodoverriding.governments.government;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Government {
    private String state;
    private int noOfMlas;
    private  String partyHeadName;
    private String homeMinisterName;

    public void freeEducation(){
        System.out.println("invoked from government class");
        System.out.println("Free education for all students under the age of 15");
    }

    public void  getGovernmentInfo(){
        System.out.println("Data: ");
        System.out.println("State: "+ getState());
        System.out.println("Number of MLAs: "+getNoOfMlas());
        System.out.println("Party head name: "+getPartyHeadName());
        System.out.println("Home minister name: "+getHomeMinisterName());
    }
}
