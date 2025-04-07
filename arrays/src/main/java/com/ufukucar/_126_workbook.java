package com.ufukucar;

import java.util.Random;

public class _126_workbook {

    public static int randomNumber () {
        Random rand = new Random();

        int sayi = rand.nextInt(50000);

        return sayi;

    }


    public static void main(String[] args) {

        int [] sayi = new int[10];
        int highScore = 0;
        int seat = 0;

        for (int i = 0; i < 10; i++) {
            sayi[i] = randomNumber();
        }

        System.out.print("Here are the scores: ");
        for (int i = 0; i < sayi.length; i++) {
            System.out.print(sayi[i] + " ");
        }


        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i] > highScore) {
                highScore = sayi[i];
                seat = i;
            }
        }

        System.out.println("\nThe highest score is " + highScore + ". Impressive!");
        System.out.println("It's the gentleman in seat: " + seat + ". Give that man a cookie!");


    }



}
