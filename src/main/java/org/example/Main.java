package org.example;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1500, LocalDate.of(2026, 2, 2));
        bankAccount.withdraw(250, LocalDate.of(2026, 2, 3));
        bankAccount.getCurrentBalance();
        bankAccount.generateStatement();
        bankAccount.withdraw(3000, LocalDate.of(2026, 2, 5));
    }
}
