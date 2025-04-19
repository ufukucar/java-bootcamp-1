package com.ufukucar._265_overriding_a_method.product;

public class Pants extends Product {

    private int waist;
    private int length;

    public Pants(double price, String color, String brand, int waist, int length) {
        super(price, color, brand);
        this.waist = waist;
        this.length = length;
    }

    public int getWaist() {
        return this.waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void fold () {
        System.out.println("Hold pants upright");
        System.out.println("Fold one leg over the other");
        System.out.println("Fold pants from bottom in thirds");
    }


}