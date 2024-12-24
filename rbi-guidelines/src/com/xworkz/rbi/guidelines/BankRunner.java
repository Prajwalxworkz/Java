package com.xworkz.rbi.guidelines;

import com.xworkz.rbi.guidelines.banks.kotak.Kotak;
import com.xworkz.rbi.guidelines.banks.kotak.KotakBengaluru;
import com.xworkz.rbi.guidelines.banks.sbi.Sbi;

public class BankRunner {
    public static void main(String[] args) {
        Guidelines guidelines= new Sbi();
        String ref=guidelines.notifications();
        System.out.println(ref);

        Guidelines guidelines1 = new KotakBengaluru();
        String ref2=guidelines1.notifications();
        System.out.println(ref2);

        Kotak kotak = new KotakBengaluru();
        kotak.account811();

    }
}
