package com.ufukucar._173_FixingTheSetter;


public class Main {

    public static void main(String[] args) {
        String [] spareParts = new String[] {"Tires", "Keys"};

        Car nissan = new Car("Nissan", 10000, 2020, "Green", spareParts);
        String [] carParts = nissan.getSpareParts();
        carParts[0] = "Filter";

        spareParts[0] = "Filter";

        Car dodge = new Car("Dodge", 10000, 2020, "Dodge", spareParts);
        Car nissan2 = new Car(nissan);

        nissan2.setColor("Yellow");
        nissan2.drive();



    }
}

