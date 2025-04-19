package com.ufukucar._269_Workbook_12_3.shape;


public class Cylinder extends Shape {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double getArea() {
        double area = (2 * Math.PI * Math.pow(this.getRadius(), 2)) + (2 * Math.PI * this.getRadius() * this.getHeight() ) ;
        return area;
    }

    @Override
    public double getVolume() {
        double volume = Math.PI * Math.pow(this.getRadius(), 2) * this.getHeight();
        return volume;
    }


}