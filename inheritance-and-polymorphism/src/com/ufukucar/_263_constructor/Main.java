package com.ufukucar._263_constructor;

import com.ufukucar._263_constructor.product.Pants;
import com.ufukucar._263_constructor.product.Product;
import com.ufukucar._263_constructor.product.Shirt;
import com.ufukucar._263_constructor.product.Shirt.Size;

public class Main {
    public static void main(String[] args) {


        Shirt shirt = new Shirt(10.99, "Red", "Nike", Size.SMALL);

        shirt.fold();
        productStore(shirt);

        Pants pants = new Pants(49.99, "Black", "Levi's", 32,32);

        pants.fold();
        productStore(pants);




    }


    public static void productStore (Product product) {
        System.out.println("Thank you purchasing " + product.getBrand() +
                " " + product.getClass().getSimpleName().toLowerCase() +
                ". " + "Your total comes to " + product.getPrice());
    }



}