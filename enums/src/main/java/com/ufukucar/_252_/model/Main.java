package com.ufukucar._252_.model;

import static com.ufukucar._252_.model.Car.TrafficLights.*;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Nissan", 2020);

        car.drive(RED);
        car.drive(YELLOW);
        car.drive(GREEN);

    }

}