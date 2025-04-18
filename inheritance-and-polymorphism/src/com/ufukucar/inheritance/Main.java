package com.ufukucar.inheritance;

import com.ufukucar.inheritance.product.Pants;
import com.ufukucar.inheritance.product.Shirt.Size;

import com.ufukucar.inheritance.product.Shirt;

public class Main {
    public static void main(String[] args) {


        Shirt shirt = new Shirt();
        shirt.setSize(Size.SMALL);
        shirt.setBrand("NIKE");
        shirt.setPrice(49.99);
        shirt.setColor("BLUE");
        shirt.fold();

        Pants pants = new Pants();
        pants.setWaist(32);
        pants.setLength(32);
        pants.setColor("BLACK");
        pants.setPrice(79.99);
        pants.setBrand("LEVI'S");
        pants.fold();

    }
}