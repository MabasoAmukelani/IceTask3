package com.mycompany.libraryaccount;

import java.util.Scanner;

public class LibraryAccount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask for account holder name
        System.out.print("Enter account holder name: ");
        String name = input.nextLine();

        // Ask for membership type
        System.out.print("Enter membership type: ");
        String membership = input.nextLine();

        // Create object
        BankAccount account = new BankAccount(name, membership);

        // Check membership validity
        if (account.checkAccountHolderMembership()) {
            System.out.println("Membership is VALID ");
        } else {
            System.out.println("Membership is NOT valid ");
        }

        input.close();
    }

    // BankAccount class
    static class BankAccount {

        String accountHolder;
        String membershipType;

        // Constructor
        public BankAccount(String accountHolder, String membershipType) {
            this.accountHolder = accountHolder;
            this.membershipType = membershipType;
        }

        // Boolean method to validate membership
        public boolean checkAccountHolderMembership() {

            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasDigit = false;

            // Loop through membershipType
            for (int i = 0; i < membershipType.length(); i++) {

                char ch = membershipType.charAt(i);

                if (Character.isUpperCase(ch)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(ch)) {
                    hasLowerCase = true;
                } else if (Character.isDigit(ch)) {
                    hasDigit = true;
                }
            }

            // Return true only if all conditions are met
            return hasUpperCase && hasLowerCase && hasDigit;
        }
    }
}