package com.testlander;

import java.util.Scanner;

public class Atm {

    public void processing(Account account) {

        Login login= new Login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamiza Hos Geldiniz!!!");

        System.out.println("*************************");
        System.out.println("Kullanici Girisi");
        System.out.println("*************************");
        int login_count = 3;

        while (true) {
            if (login.login(account)) {
                System.out.println("Login Success!!!");
                break;
            } else {
                System.out.println("Login failed!!!");
                login_count -=1;
                System.out.println("Remaining login attempt: " + login_count);
            }

            if (login_count == 0) {
                System.out.println("No more login..");
                return;
            }
        }

        System.out.println("***************************");
        String transactions = "1. View Balance\n" +
                "2. Deposit\n" +
                "3. Withdraw\n" +
                "4. Press q to exit";
        System.out.println(transactions);
        System.out.println("***************************");

        while (true) {
            System.out.println("Select transaction: ");
            String transaction = scanner.nextLine();

            if (transaction.equals("q")) {
                break;
            }
            else if (transaction.equals("1")) {
                System.out.println("Your balance: " + account.getBalance());
            }
            else  if (transaction.equals("2")) {
                System.out.println("Please enter deposit amount");
                int depositAmount = scanner.nextInt();
                scanner.nextLine();
                account.depositMoney(depositAmount);
            }
            else if (transaction.equals("3")){
                System.out.println("Please enter withdraw amount");
                int withdrawAmount = scanner.nextInt();
                scanner.nextLine();
                account.withdrawMoney(withdrawAmount);
            }
            else {
                System.out.println("Wrong transaction...");
            }
        }
    }
}
