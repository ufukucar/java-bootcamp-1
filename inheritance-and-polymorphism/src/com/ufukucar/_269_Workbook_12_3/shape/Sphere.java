package com.ufukucar._269_Workbook_12_3.shape;

public class Sphere extends Shape {

    public Sphere(double radius) {
        super(radius);
    }


    @Override
    public double getArea() {
        double area = 4 * Math.PI * Math.pow(this.getRadius(), 2);
        return area;
    }

    @Override
    public double getVolume() {

        double volume = (4/3) * Math.PI * Math.pow(this.getRadius(), 3);
        return volume;
    }

}