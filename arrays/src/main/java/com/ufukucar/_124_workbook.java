package com.ufukucar;

import java.util.Scanner;

public class _124_workbook {

    public static void main(String[] args) {

        String [] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        System.out.println("Welcome to Java Grocers.");
        System.out.println("What can I help you find");

        Scanner input = new Scanner(System.in);
        String _input = input.nextLine();


        for ( int i = 0; i < aisles.length; i++ ) {

            if ( aisles[i].equals( _input ) ) {
                System.out.println("\nWe have that in aisle:  " + i);
            }
        }


    }
}
