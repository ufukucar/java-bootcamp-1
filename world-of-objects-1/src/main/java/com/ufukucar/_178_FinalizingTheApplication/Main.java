package com.ufukucar._178_FinalizingTheApplication;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Car[] cars = new Car[] {
                new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
                new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
                new Car("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
                new Car("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
                new Car("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
        };

        DealerShip dealership = new DealerShip(cars);


        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.println("Feel free to browse through our collection of cars.\n");
        System.out.println(dealership);
        System.out.println("Which car are you interested in? (0 – 4).\n");
        int index = scan.nextInt();

        dealership.sell(index);
        // sell car here...

        scan.close();

    }
}