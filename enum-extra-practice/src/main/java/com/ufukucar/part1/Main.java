package com.ufukucar.part1;

import com.ufukucar.part1.models.Car;
import static com.ufukucar.part1.models.Car.*;
import static com.ufukucar.part1.models.Car.BodyType.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", SEDAN, 2020, 30000);
        System.out.println(car1.getMake());

        // Uncomment the following line to test invalid input for setMake method
        car1.setMake("Nissan");

        // Uncomment the following line to test invalid input for setModel method
        car1.setModel("Altima");

        // Uncomment the following line to test invalid input for setBodyType method
        car1.setBodyType(SUV);

        // Uncomment the following line to test invalid input for setProductionYear method
        car1.setProductionYear(MIN_YEAR + 5);

        // Uncomment the following line to test invalid input for setPrice method
        car1.setPrice(5_000);

        // Uncomment the following line to test invalid input for setPrice method
        car1.setPrice(10_000);

        // Uncomment the following line to test invalid input for the constructor
        Car car2 = new Car("Toyota", "Camry", SEDAN, 2020, 30000);


    }
}