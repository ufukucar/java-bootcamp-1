package com.ufukucar;

public class _123_workbook {

    public static void main(String[] args) {

        String [] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        System.out.println("Do you sell coffee?");

        for (int i = 0; i < aisles.length; i++) {

            if ( aisles[i].equalsIgnoreCase("coffee") ) {
                System.out.println("\nWe have that in aisle:  " + i);
            }
        }


    }
}
