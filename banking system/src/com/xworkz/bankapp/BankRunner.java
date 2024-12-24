package com.xworkz.bankapp;

import com.xworkz.bankapp.bankAccount.BankAccount;
import com.xworkz.bankapp.savings.SavingsAccount;

public class BankRunner {
    public static void main(String[] args) {

        SavingsAccount mySavingsAccount= new SavingsAccount();
        mySavingsAccount.interest=2.75;
        mySavingsAccount.credit(65000);
        System.out.println("------------------------------");
        System.out.println("*******************************");
        System.out.println("-------------------------------");

        SavingsAccount sumanth=new SavingsAccount();
        sumanth.interest=2.80;
        mySavingsAccount.transfer(sumanth,2000);
        System.out.println("------------------------------");
        System.out.println("*******************************");
        System.out.println("-------------------------------");

        SavingsAccount kruthik = new SavingsAccount();
        kruthik.interest=2.85;
        mySavingsAccount.transfer(kruthik, 1000);
        System.out.println("------------------------------");
        System.out.println("*******************************");
        System.out.println("-------------------------------");

        SavingsAccount sanjay = new SavingsAccount();
        sanjay.interest=3.50;
        mySavingsAccount.transfer(sanjay, 3000);
        System.out.println("------------------------------");
        System.out.println("*******************************");
        System.out.println("-------------------------------");

        SavingsAccount bilvesh= new SavingsAccount();
        bilvesh.interest=3.25;
        mySavingsAccount.transfer(bilvesh, 1000);
        System.out.println("------------------------------");
        System.out.println("*******************************");
        System.out.println("-------------------------------");

        SavingsAccount sudeesh = new SavingsAccount();
        sudeesh.interest=2.80;
        mySavingsAccount.transfer(sudeesh,1000);
        System.out.println("------------------------------");
        System.out.println("*******************************");
        System.out.println("-------------------------------");

        SavingsAccount kiran =(SavingsAccount) new BankAccount();
        kiran.interest=2.80;
        mySavingsAccount.transfer (kiran, 2000);



//        SavingsAccount salaryAccount= new SavingsAccount(3.25,10000);
//        System.out.println("Available balance: Rs " +salaryAccount.getBalance());
//        salaryAccount.credit(65700);
//        System.out.println("Available balance: Rs " +salaryAccount.getBalance());
//        salaryAccount.calculateSimpleInterest();
//        System.out.println("Available balance: Rs " +salaryAccount.getBalance());


    }
}
