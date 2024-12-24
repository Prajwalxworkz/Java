package com.xworkz.rbi.guidelines;

import com.xworkz.rbi.guidelines.banks.sbi.Sbi;

public interface Guidelines {

    void serviceCharges();
    void payableAtPar();
   public  default String notifications(){
       return "notification to all its customers";
   };
    void positivePaySystem();
}
