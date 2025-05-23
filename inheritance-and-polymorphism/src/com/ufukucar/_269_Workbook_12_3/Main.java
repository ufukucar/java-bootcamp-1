package com.ufukucar._269_Workbook_12_3;
import com.ufukucar._269_Workbook_12_3.shape.Cylinder;
import com.ufukucar._269_Workbook_12_3.shape.Shape;
import com.ufukucar._269_Workbook_12_3.shape.Sphere;

public class Main {

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(1.0, 2.0);
        Sphere sphere = new Sphere(1.0);

        printMeasures(cylinder);
        printMeasures(sphere);
    }

    public static void printMeasures(Shape shape) {
        System.out.println("\n" + shape.getClass().getSimpleName());

        double area = shape.getArea();
        double volume = shape.getVolume();

        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
    }


}