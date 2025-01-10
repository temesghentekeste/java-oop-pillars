package org.example.oop_pillars._02_inheritance._01_code_reusability;

public class CodeReusabilityRunner {
    public static void main(String[] args) {
        SavingsAccount savingAccount = new SavingsAccount("00900675420", "password", 45000, 20);
        double initialBalance = savingAccount.getBalance("password");
        System.out.println("Initial Balance: " + initialBalance);
        savingAccount.applyInterest("password");
        double interestAppliedBalance = savingAccount.getBalance("password");
        System.out.println("Post Interest Balance: " + interestAppliedBalance);



    }
}
