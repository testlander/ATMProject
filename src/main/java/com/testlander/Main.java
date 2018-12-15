package com.testlander;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Ebru!!!");
        //Object oriented (Nesne Yonelimli) ATM Projesi

        //Login Class'i Kullanici Girisini Kontrol Edecek.
        //Hesap Class'i Hesap Islemlerini yapacak.
        //ATM ise atm'mizi calistiracak.

        Atm atm = new Atm();

        Account account = new Account("Mete Boyaci", "54321", 3500);

        atm.processing(account);
        System.out.println("Exiting from the program..");
    }
}
