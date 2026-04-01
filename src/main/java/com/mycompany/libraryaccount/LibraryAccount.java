/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libraryaccount;

/**
 *
 * @author fazet
 */
import java.util.Scanner;
public class LibraryAccount {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    // library account
    

public class LibraryAccountTask {
    

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // ask for name
        System.out.print("Enter account holder name: ");
        String name = input.nextLine();

        BankAccount account = new BankAccount(name);

        // check VVIP
        if (account.checkAccountHolderStatus()) {
            System.out.println("Welcome VVIP " + name.toLowerCase());
        } else {
            System.out.println("Welcome " + name.toLowerCase());
        }

       
        System.out.println("Enter membership type");

        BankAccount acc1 = new BankAccount("John");
        BankAccount acc2 = new BankAccount("Michael");
        BankAccount acc3 = new BankAccount("Ann*");

        System.out.println(acc1.accountHolder + " VVIP: " + acc1.checkAccountHolderStatus());
        System.out.println(acc2.accountHolder + " VVIP: " + acc2.checkAccountHolderStatus());
        System.out.println(acc3.accountHolder + " VVIP: " + acc3.checkAccountHolderStatus());
    }

    // make it static so main can use it
        public static class BankAccount {

        // existing variable
        String accountHolder;

        // constructor
        public BankAccount(String accountHolder) {
            this.accountHolder = accountHolder;
        }

        // boolean method 
        public boolean checkAccountHolderStatus() {
            return accountHolder.contains("*") || accountHolder.length() > 6;
        }
    }
    }
}
