package org.example.oop_pillars._02_inheritance._02_extensibility;

import org.example.oop_pillars._02_inheritance._01_code_reusability.BankAccount;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String password, double initialBalance, double interestRate) {
        super(accountNumber, password, initialBalance);
        this.interestRate = interestRate;
    }

    public double calculateInterest(String enteredPassword) {
        double balance = getBalance(enteredPassword);
        if (balance != -1) {
            return balance * (interestRate / 100);
        } else {
            return 0;
        }
    }

    public void applyInterest(String enteredPassword) {
        double interest = calculateInterest(enteredPassword);
        if (interest > 0) {
            deposit(interest);
            System.out.println("Interest applied: " + interest);
        }
    }
}