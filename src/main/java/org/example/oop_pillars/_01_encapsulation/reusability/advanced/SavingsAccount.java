package org.example.oop_pillars._01_encapsulation.reusability.advanced;

import org.example.oop_pillars._01_encapsulation.reusability.BankAccount;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, 

              String password, double initialBalance, double interestRate) {
        super(accountNumber, password, initialBalance);
        this.interestRate = interestRate;
    }

    public void addInterest(String enteredPassword) {
        double interest = getBalance(enteredPassword) * interestRate / 100;
        deposit(interest);
    }
}