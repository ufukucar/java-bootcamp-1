package com.ufukucar._167_TheTaskDrive;


public class _167_Main {
    public static void main(String[] args) {

        _167_Car nissan = new _167_Car("Nissan", 10000, 2020, "Green");

        _167_Car nissan2 = new _167_Car(nissan);

        nissan2.setColor("Yellow");
        nissan.setColor("Orange");
        nissan2.setColor("Blue");
        nissan.setColor("Purple");
        nissan2.setColor("Fuchsia");
        nissan.setColor("Beige");

        _167_Car dodge = new _167_Car("Dodge", 10000, 2020, "Dodge");

        System.out.println("This " + nissan.getMake()   + " is worth $" + nissan.getPrice() +
                ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
        System.out.println("This " + dodge.getMake()    + " is worth $" + dodge.getPrice() +
                ". It was built in " + dodge.getYear()  + ". It is " + dodge.getColor() + ".\n");


    }
}