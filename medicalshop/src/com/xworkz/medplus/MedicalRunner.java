package com.xworkz.medplus;

import com.xworkz.medplus.drugs.Tablet;
import com.xworkz.medplus.medical.Medical;

import java.util.Scanner;

public class MedicalRunner {
    public static void main(String[] args) {
        Medical medical = new Medical();
        Tablet tablet = new Tablet();
       // System.out.println(tablet);
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the id");
        int id=s.nextInt();
        tablet.setId(id);
        System.out.println("Enter the tablet  name");
        s.nextLine();
        String name=s.nextLine();
        tablet.setName(name);
        System.out.println("Enter the mfd");
        s.nextLine();
        String mfd=s.nextLine();
        tablet.setMfd(mfd);
        System.out.println("Enter the exp");
        s.nextLine();
        String exp=s.nextLine();
        tablet.setExp(exp);
        System.out.println("Enter the numberOfTablets");
        int numberOfTablets=s.nextInt();
        tablet.setNumOfTablets(numberOfTablets);
        System.out.println("Enter the price");
        double price=s.nextDouble();
        tablet.setPrice(price);
        System.out.println(tablet);
/*
        Tablet tablet1 = new Tablet();
        //System.out.println(tablet);
        tablet1.setId(101);
        tablet1.setName("Dolo-650");
        tablet1.setMfd("23-10-2023");
        tablet1.setExp("14-11-2025");
        tablet1.setNumOfTablets(10);
        tablet1.setPrice(20.0);
        System.out.println(tablet);

        int hashCode=tablet1.hashCode();
        System.out.println(hashCode);
        boolean equal=tablet.equals(tablet1);
        System.out.println(equal);

//        boolean isDrugAdded= medical.addDrug(tablet);
//        System.out.println("Is tablet added: "+isDrugAdded);
//        medical.getDrugDetail();
 */
    }
}
