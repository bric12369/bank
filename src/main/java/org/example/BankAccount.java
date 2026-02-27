package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class BankAccount {

    int balance;
    ArrayList<String> statement = new ArrayList<>();

    public BankAccount() {
        this.statement.add("Date");
        this.statement.add("Credit");
        this.statement.add("Debit");
        this.statement.add("Balance");
    }

    public void deposit(int amount, LocalDate date){
        this.balance += amount;
        this.statement.add(date.toString());
        this.statement.add(String.valueOf(amount));
        this.statement.add("-");
        this.statement.add(String.valueOf(this.balance));
    }

    public void withdraw(int amount, LocalDate date){
        if (amount > this.balance) {
            System.out.println("Transaction declined: insufficient funds");
        } else {
            this.balance -= amount;
            this.statement.add(date.toString());
            this.statement.add("-");
            this.statement.add(String.valueOf(amount));
            this.statement.add(String.valueOf(this.balance));
        }
    }

    public void getCurrentBalance(){
        System.out.println(this.balance);
    }

    public void generateStatement(){
        StringBuilder formattedStatement = new StringBuilder();
        for (int i = 0; i < this.statement.size(); i++) {
            formattedStatement.append(this.statement.get(i));
            if ((i+1) % 4 != 0) {
                formattedStatement.append(" || ");
            }
            if ((i+1) % 4 == 0) {
                System.out.println(formattedStatement);
                formattedStatement = new StringBuilder();
            }
        }
    }
}
