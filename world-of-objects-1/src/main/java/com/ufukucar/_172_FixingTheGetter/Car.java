package com.ufukucar._172_FixingTheGetter;


import java.util.Arrays;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] spareParts;

    public Car(String make, double price, int year, String color, String[] spareParts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.spareParts = Arrays.copyOf(spareParts, spareParts.length);
    }



    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.spareParts = Arrays.copyOf(source.spareParts, source.spareParts.length);
    }

    public String[] getSpareParts() {
        return Arrays.copyOf(spareParts, spareParts.length);
    }

    public void setSpareParts(String[] spareParts) {
        this.spareParts = spareParts;
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
}
