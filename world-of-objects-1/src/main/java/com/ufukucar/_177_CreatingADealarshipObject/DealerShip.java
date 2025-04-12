package com.ufukucar._177_CreatingADealarshipObject;

public class DealerShip {

    private Car[] cars;

    public DealerShip(Car[] cars) {

        this.cars = new Car[cars.length];

        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }

        //this.cars = Arrays.copyOf(cars, cars.length); // -> Bu yanlış
    }



}
