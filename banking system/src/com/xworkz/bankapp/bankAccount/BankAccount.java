package com.xworkz.bankapp.bankAccount;

public class BankAccount {
    private double balance;
    static  int count;

    public BankAccount() {

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void debit(double amount){
        if(balance>0){
            balance=balance-amount;
        }
        System.out.println(count++ +". "+"Available balance: "+this.getBalance());
    }
    public void credit(double amount){
        balance=balance+amount;
        System.out.println("   Available balance: "+this.getBalance());
    }

    public  void transfer(BankAccount beneficiaryAccount, double amount){
        this.debit(amount);
        beneficiaryAccount.credit(amount);


    }

}
