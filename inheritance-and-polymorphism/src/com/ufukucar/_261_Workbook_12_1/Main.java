package com.ufukucar._261_Workbook_12_1;

import com.ufukucar._261_Workbook_12_1.shape.Cylinder;
import com.ufukucar._261_Workbook_12_1.shape.Sphere;

public class Main {

    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(2.0);
        cylinder.setRadius(1.0);

        Sphere sphere = new Sphere();
        sphere.setRadius(1.0);

        System.out.println("Sphere - radius: " + sphere.getRadius());
        System.out.println("Cylinder - radius: " + cylinder.getRadius() + " height " + cylinder.getHeight());

    }



}
