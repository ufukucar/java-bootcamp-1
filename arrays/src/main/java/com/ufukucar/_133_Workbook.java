package com.ufukucar;

import java.util.Arrays;

public class _133_Workbook {

    public static double [] celciusToFahrenheit ( double [] celcius) {

        double [] fahrenheit = Arrays.copyOf(celcius, celcius.length);

        for (int i = 0; i < fahrenheit.length; i++) {
            fahrenheit[i] =  ( (fahrenheit[i] / 5 ) * 9 ) + 32;
        }

        return fahrenheit;

    }

    public static void printTemperatures ( double [] tempratures, String tempType ) {

        System.out.print(tempType + ": ");
        for (int i = 0; i < tempratures.length; i++) {
            System.out.print(tempratures[i] + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {

        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};

        double [] fahrenheit = celciusToFahrenheit(celsius);

        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "Fahrenheit");

        //System.out.println(Arrays.toString(celsius));
        //System.out.println(Arrays.toString(fahrenheit));



    }


}
