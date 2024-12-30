package org.example.oop_pillars._01_encapsulation.reusability.simple;

import org.example.oop_pillars._01_encapsulation.reusability.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount personalAccount = new BankAccount("12345", "personal123", 1000.00);
        BankAccount businessAccount = new BankAccount("54321", "business456", 5000.00);

        personalAccount.deposit(500.00);
        businessAccount.withdraw(1000.00, "personal123");

        System.out.println("Personal Account Balance: " + 
                                personalAccount.getBalance("business456"));
        System.out.println("Business Account Balance: " 
 + 
                                businessAccount.getBalance("business456"));
    }
}