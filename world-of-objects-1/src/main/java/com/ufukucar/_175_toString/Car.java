package com.ufukucar._175_toString;


import java.util.Arrays;
import java.util.StringJoiner;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }



    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    public String[] getparts() {
        return Arrays.copyOf(parts, parts.length);
    }

    public void setparts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void drive() {
        System.out.println("\n You bought the beautiful " + this.year + " " + this.color + " " + this.make + " " + this.price + ".");
        System.out.println("Please drive your car to the nearest exit . \n");
    }


    @Override
    public String toString() {
        return "Make: " + this.make + ".\n"
                +  "Price: " + this.price + ".\n"
                +  "Year: " + this.year + ".\n"
                +  "Color: " + this.color + ".\n"
                +  "Parts: " + Arrays.toString(parts) + ".\n";
    }
}
