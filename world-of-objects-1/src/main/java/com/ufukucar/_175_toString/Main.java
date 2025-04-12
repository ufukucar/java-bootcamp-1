package com.ufukucar._175_toString;


public class Main {

    public static void main(String[] args) {

        Car nissan = new Car("Nissan", 10000, 2020, "Green",  new String[] {"Tires", "Keys"});
        Car dodge = new Car("Dodge", 10000, 2020, "Dodge",  new String[] {"Tires", "Keys"});
        Car nissan2 = new Car(nissan);


        System.out.println(nissan);
        System.out.println(dodge);
        System.out.println(nissan2);


    }
}

