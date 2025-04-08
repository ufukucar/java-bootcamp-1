package com.ufukucar;

import java.util.Scanner;

public class _131_Workbook {

    public static void main(String[] args) {

        System.out.println("Java PizzaDelivery. How many pizza toppings do you want?");

        Scanner sc = new Scanner(System.in);

        int toppingSize = sc.nextInt();
        sc.nextLine();

        if (toppingSize > 0) {

            String[] toppings = new String[toppingSize];

            System.out.println("Great, enter each topping: ");

            for (int i = 0; i < toppingSize; i++) {
                toppings[i] = sc.nextLine();
            }

            System.out.println("\nThank you! Here are the toppings you ordered: ");
            for (String topping : toppings) {
                System.out.println(topping);
            }

        } else {

            System.out.println("You don't have any toppings!");
        }


    }
}
