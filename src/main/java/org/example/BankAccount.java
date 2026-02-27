package org.example;

public class BankAccount {

    int balance;

    public void deposit(int amount){
        this.balance += amount;
    }

    public void withdraw(int amount){
        this.balance -= amount;
    }

    public void getCurrentBalance(){
        System.out.println(this.balance);
    }
}
