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

### Blog Post
For a detailed explanation of Encapsulation and its role in OOP, check out the blog post:
[Unlocking the Power of Encapsulation in Java](https://uandiprogramming.blogspot.com/2024/12/unlocking-power-of-encapsulation-in.html)

### Getting Started
- Clone the repository:git clone https://github.com/temesghentekeste/oop-fundamentals-java.git
- Navigate to the Encapsulation folder or directly start exploring the code examples provided.

### Contributing
If you have improvements, bug fixes, or additional examples related to Encapsulation, feel free to fork the repository and submit a pull request.

GitHub Repository
You can access the entire source code of this project on GitHub:
https://github.com/temesghentekeste/oop-fundamentals-java
