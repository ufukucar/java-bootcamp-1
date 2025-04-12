package com.ufukucar._179_DeepCopying;

public class DealerShip {

    private Car[] cars;

    public DealerShip(Car[] cars) {

        this.cars = new Car[cars.length];

        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }

        //this.cars = Arrays.copyOf(cars, cars.length); // -> Bu yanlış
    }

    public Car getCar(int index) {

        /* Deep copy:  duplicates an object */
        Car copy = new Car(this.cars[index]);
        return copy;

        // return this.cars[index]; // Nesneler ile uğraşırken çok tehlikeli. Referans döndürüyoruz aslında. bu yüzden deep copy yapmalı
    }

    public void setCar(int index, Car newCar) {

        Car copy = new Car (newCar);
        this.cars[index] = copy;

       // this.cars[index] = car; // Nesneler ile uğraşırken çok tehlikeli. Referans tuzağı. bu yüzden deep copy yapmalı
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
