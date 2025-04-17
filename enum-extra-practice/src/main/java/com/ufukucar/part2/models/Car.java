package com.ufukucar.part2.models;

public class Car {

    private String make;
    private String model;
    private BodyType bodyType;  // Should this really be a String?
    private int productionYear;
    private double price;

    public enum BodyType {
        SEDAN, COUPE, HATCHBACK, SUV, VAN, TRUCK
    }

    public static final int MIN_YEAR = 1900;
    public static final double MIN_PRICE = 0;
    public static final double MAX_PRICE = 200000;

    public Car(String make, String model, BodyType bodyType, int productionYear, double price) {
        setMake(make);
        setModel(model);
        setBodyType(bodyType);
        setProductionYear(productionYear);
        setPrice(price);
    }

    public Car (Car source) {
        setMake(source.getMake());
        setModel(source.getModel());
        setBodyType(source.getBodyType());
        setProductionYear(source.getProductionYear());
        setPrice(source.getPrice());
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {

        if ( make == null || make.isBlank() ) {
            throw new IllegalArgumentException("The make cannot be null or blank");
        }

        this.make = make;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {
        if ( model == null || model.isBlank() ) {
            throw new IllegalArgumentException("The model cannot be null or blank");
        }

        this.model = model;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        if ( bodyType == null ) {
            throw new IllegalArgumentException("The bodyType cannot be null");
        }
        this.bodyType = bodyType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        if ( productionYear < MIN_YEAR ) {
            throw new IllegalArgumentException("The productionYear must be >= " + MIN_YEAR);
        }
        this.productionYear = productionYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < MIN_PRICE || price > MAX_PRICE) {
            throw new IllegalArgumentException("Price must be within a valid range.");
        }
        this.price = price;
    }
}
