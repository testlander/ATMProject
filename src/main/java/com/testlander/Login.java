package com.testlander;

import java.util.Scanner;

public class Login {
    public boolean login(Account account) {

        Scanner scanner = new Scanner(System.in);
        String user;
        String passwd;

        System.out.print("Enter username: ");
        user = scanner.nextLine();
        System.out.print("Enter password: ");
        passwd = scanner.nextLine();

        if (account.getUserName().equals(user) && account.getPassword().equals(passwd)) {
            return true;
        } else {
            return false;
        }
    }
}
