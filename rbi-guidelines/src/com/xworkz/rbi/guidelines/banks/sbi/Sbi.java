package com.xworkz.rbi.guidelines.banks.sbi;

import com.xworkz.rbi.guidelines.Guidelines;

public class Sbi implements Guidelines {

    @Override
    public void serviceCharges() {
        System.out.println("Service charges depends on the mode of transactions you do");
    }

    @Override
    public void payableAtPar() {
        System.out.println("the payee can present the cheque at any SBI branch or in clearing for the amount printed on the cheque");
    }


    public  String notifications() {
        return "SBI will provide notifications to all its customers";
    }

    @Override
    public void positivePaySystem() {
        System.out.println("Above Rs.50000");
    }
}
