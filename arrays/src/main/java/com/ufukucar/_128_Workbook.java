package com.ufukucar;

public class _128_Workbook {

    public static  void main(String[] args) {

        String [] apples = {"Gala", "Granny Smith", "Macintosh"};
        double [] prices =  {1.99, 1.49, 1.29};

        System.out.println("Java Receipt");
        System.out.println("Here's your receipt");
        for ( int i = 0; i < apples.length; i++ ) {

            System.out.println(apples[i] + ": " + prices[i] );
        }





    }


}
