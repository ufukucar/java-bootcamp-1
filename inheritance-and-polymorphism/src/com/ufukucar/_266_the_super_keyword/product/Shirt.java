package com.ufukucar._266_the_super_keyword.product;

public class Shirt extends Product {


    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}

    public Shirt(double price, String color, String brand, Size size) {
        super(price, color, brand);
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void fold () {
        super.fold();
        System.out.println("Lay shirt on a flat surface");
        System.out.println("Fold the shirt sideways");
        System.out.println("Bring sleeves in");
        System.out.println("Fold from bottom up");
    }


}