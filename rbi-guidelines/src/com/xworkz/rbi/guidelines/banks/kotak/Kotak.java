package com.xworkz.rbi.guidelines.banks.kotak;

import com.xworkz.rbi.guidelines.Guidelines;

public abstract class Kotak implements Guidelines {


    @Override
    public void serviceCharges() {
        System.out.println("Charges depends");
    }

    @Override
    public void payableAtPar() {
        System.out.println("Any checks acceptable");
    }

    public abstract void account811();
    @Override
    public void positivePaySystem() {

    }
}
