package org.example;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @org.junit.jupiter.api.Test
    void deposit() {
         Account account = new Account(100);
        account.deposit(200);
        assertEquals(300, account.checkBalance());

    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        Account account = new Account(500);
        account.withdraw(200);
        assertEquals(300, account.checkBalance());

    }

    @org.junit.jupiter.api.Test
    void checkBalance() {
         Account account = new Account(500);
        assertEquals(500, account.checkBalance());
    }

    @org.junit.jupiter.api.Test
    void transfer() {

        Account account1 = new Account(500);
        Account account2 = new Account(300);
        account1.transfer(200, account2);
        assertEquals(300, account1.checkBalance());
        assertEquals(500, account2.checkBalance());

    }
}