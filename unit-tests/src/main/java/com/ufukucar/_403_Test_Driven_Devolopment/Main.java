package com.ufukucar._403_Test_Driven_Devolopment;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Main {
    
    static double[] prices = new double[] {2.23, 1.32, 4.32, 11.33};

    public static void main(String[] args) {



    }

    public static double getSubtotal() {

        double temp = 0;

        for (int i = 0; i < prices.length; i++) {
            temp += prices[i];
        }

        return temp;
    }

    public static double getTax (double subtotal) {

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US); // Nokta kullanır
        DecimalFormat formatter = new DecimalFormat("#.##", symbols);


        return Double.parseDouble(formatter.format(subtotal * 0.13));
    }


    public static double getTotal(double subtotal, double tax) {

        return subtotal + tax;
    }



}
