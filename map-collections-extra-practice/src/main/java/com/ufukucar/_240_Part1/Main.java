package com.ufukucar._240_Part1;

public class Main {
    public static void main(String[] args) {

        City city1 = new City("New York", "USA", 8_500_000);
        System.out.println(city1.getName());
        System.out.println(city1.getPopulation());


        city1.setName("Toronto");

        city1.setCountry("Canada");

        city1.setPopulation(1_000_000);


        City city2 = new City("Boston", "USA", 8_500_000);
    }
}