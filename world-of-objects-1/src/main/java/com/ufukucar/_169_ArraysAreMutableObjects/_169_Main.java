package com.ufukucar._169_ArraysAreMutableObjects;


public class _169_Main {
    public static void main(String[] args) {

        String [] spareParts = new String[] {"Tires", "Keys"};

        _169_Car nissan = new _169_Car("Nissan", 10000, 2020, "Green", spareParts);
        _169_Car dodge = new _169_Car("Dodge", 10000, 2020, "Dodge", spareParts);

        spareParts[0] = "Filter";

        _169_Car nissan2 = new _169_Car(nissan);

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