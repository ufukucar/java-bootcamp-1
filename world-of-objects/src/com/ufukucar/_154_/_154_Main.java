package com.ufukucar._154_;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class _154_Main {
    public static void main(String[] args) {

        _154_Car nissan = new _154_Car();

        nissan.make = "Nissan";
        nissan.price = 10000;
        nissan.year = 2020;
        nissan.color = "Green";

        _154_Car dodge = new _154_Car();

        dodge.make = "Dodge";
        dodge.price = 11000;
        dodge.year = 2019;
        dodge.color = "Blue";

        System.out.println("This " + nissan.make + " is worth $" + nissan.price +
                ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");
        System.out.println("This " + dodge.make + " is worth $" + dodge.price +
                ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n");

    }
}