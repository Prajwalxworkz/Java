package com.xworkz.bankapp.savings;

import com.xworkz.bankapp.bankAccount.BankAccount;

public class SavingsAccount extends BankAccount {
    public double interest;
    public SavingsAccount() {
    }

    public SavingsAccount(double interest, double minBalance) {
        setBalance(minBalance);
        this.interest = interest;
    }

    public void calculateSimpleInterest(){
         double calculatedSimpleInterest=(interest*getBalance())/100;
         credit(calculatedSimpleInterest);
    }
}
