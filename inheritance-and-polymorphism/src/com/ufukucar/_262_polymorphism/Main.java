package com.ufukucar._262_polymorphism;

import com.ufukucar._262_polymorphism.product.Product;
import com.ufukucar._262_polymorphism.product.Shirt.Size;
import com.ufukucar._262_polymorphism.product.Pants;
import com.ufukucar._262_polymorphism.product.Shirt;

public class Main {
    public static void main(String[] args) {


        Shirt shirt = new Shirt();
        shirt.setSize(Size.SMALL);
        shirt.setBrand("NIKE");
        shirt.setPrice(49.99);
        shirt.setColor("BLUE");
        shirt.fold();
        productStore(shirt);

        Pants pants = new Pants();
        pants.setWaist(32);
        pants.setLength(32);
        pants.setColor("BLACK");
        pants.setPrice(79.99);
        pants.setBrand("LEVI'S");
        pants.fold();
        productStore(pants);

    }

    public static void productStore (Product product) {
        System.out.println("Thank you purchasing " + product.getBrand() + " " + product.getClass().getSimpleName().toLowerCase() + ". " + "Your total comes to " + product.getPrice());
    }



}