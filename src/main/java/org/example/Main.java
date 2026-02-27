package org.example;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20);
        bankAccount.withdraw(10);
        bankAccount.getCurrentBalance();
    }

}
