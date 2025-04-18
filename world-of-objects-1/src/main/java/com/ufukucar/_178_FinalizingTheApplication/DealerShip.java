package com.ufukucar._178_FinalizingTheApplication;

public class DealerShip {

    private Car[] cars;

    public DealerShip(Car[] cars) {

        this.cars = new Car[cars.length];

        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }

        //this.cars = Arrays.copyOf(cars, cars.length); // -> Bu yanlış
    }


    public void sell (int index) {
        this.cars[index].drive();
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }
        return temp;
    }


}
