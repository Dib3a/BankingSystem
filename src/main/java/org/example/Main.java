
package org.example;

public class Main {
    public static void main(String[] args) {

         Account account1 = new Account(1000);
        Account account2 = new Account(3000);



        account1.deposit(200);
        account2.withdraw(100);
        account1.transfer(400, account2);


    }
}