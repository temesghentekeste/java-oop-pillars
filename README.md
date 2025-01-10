# Fundamentals of OOP in Java: 

## 1. Encapsulation

Welcome to the **Encapsulation** section of the **Fundamentals of OOP in Java** repository! This section focuses on the concept of **Encapsulation**, one of the core principles of Object-Oriented Programming (OOP).

### What is Encapsulation?

Encapsulation is the practice of hiding the internal details of an object and providing access to them only through public methods. This helps ensure the integrity of the object's data by preventing outside interference and misuse of its state.

Key benefits of encapsulation include:

- **Data Protection**: It helps protect an object's internal state by controlling how data is accessed and modified.
- **Ease of Maintenance**: By hiding the complexity, it makes the code easier to manage and maintain.
- **Flexibility**: It allows changes to the internal implementation without affecting external code that uses the object.

### Examples

In this repository, you'll find Java examples that demonstrate how to implement encapsulation. For instance, the following example shows how encapsulation is applied in a `BankAccount` class:

```java
public class BankAccount {
    private double balance; // Private field, cannot be accessed directly outside the class

    // Public method to access and modify the balance
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Modifying balance via a method
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Modifying balance via a method
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance!");
        }
    }
}
```
In this example, the balance field is private, and access to it is controlled via the getBalance(), deposit(), and withdraw() methods. This ensures that the balance can only be modified through controlled actions, preventing direct external manipulation.


## 2. Inheritance

This section explores Inheritance, another fundamental principle of Object-Oriented Programming.

What is Inheritance?

Inheritance allows a class (called the child or subclass) to acquire the properties and behaviors of another class (called the parent or superclass). It promotes code reuse and extends functionality efficiently.

Key benefits of inheritance include:

- **Code Reusability**: Share common functionality among multiple classes without duplication.

- **Extensibility**: Add or override functionality in subclasses to meet specific requirements.

- **Maintainability**: Centralize common behavior, making updates and changes easier to manage.

### Examples: Creating Specialized Accounts

In this repository, you will find examples of inheritance implemented using the BankAccount class discussed in the Encapsulation section. For instance:
```java
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
}
```
Here, the SavingsAccount class extends the BankAccount class, reusing existing methods like getBalance while adding new functionality specific to savings accounts.

### Blog Post
- For a detailed explanation of Encapsulation and its role in OOP, check out the blog post:
[Unlocking the Power of Encapsulation in Java](https://uandiprogramming.blogspot.com/2024/12/unlocking-power-of-encapsulation-in.html)
- To learn more about inheritance and its applications, check out the blog post:
  [Unlocking the Power of Inheritance in Java](https://uandiprogramming.blogspot.com/2025/01/unlocking-power-of-inheritance-in-java.html)

### Getting Started
- Clone the repository:git clone https://github.com/temesghentekeste/oop-fundamentals-java.git
- Navigate to the Encapsulation folder or directly start exploring the code examples provided.
- Navigate to the Inheritance folder in the repository to explore the examples provided.
  - Try extending the BankAccount class yourself to create new account types with specialized behaviors.

### Contributing
If you have improvements, bug fixes, or additional examples related to Encapsulation, feel free to fork the repository and submit a pull request.

GitHub Repository
You can access the entire source code of this project on GitHub:
https://github.com/temesghentekeste/oop-fundamentals-java
