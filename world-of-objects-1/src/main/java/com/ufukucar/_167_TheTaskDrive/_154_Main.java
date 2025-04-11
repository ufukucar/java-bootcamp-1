package com.ufukucar._167_TheTaskDrive;


public class _154_Main {
    public static void main(String[] args) {

        String [] spareParts = new String[] {"Tires", "Keys"};

        _154_Car nissan = new _154_Car("Nissan", 10000, 2020, "Green", spareParts);
        _154_Car dodge = new _154_Car("Dodge", 10000, 2020, "Dodge", spareParts);

        spareParts[0] = "Filter";

        _154_Car nissan2 = new _154_Car(nissan);

        nissan2.setColor("Yellow");
        nissan.setColor("Orange");
        nissan2.setColor("Blue");
        nissan.setColor("Purple");
        nissan2.setColor("Fuchsia");
        nissan.setColor("Beige");


        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() +
                ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
        System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() +
                ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");




    }
}