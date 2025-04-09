package com.ufukucar;

import java.util.Scanner;

public class _140_Javapedia {

    public static void printJavaPedia(String[][] array) {

        System.out.println("\nThese are the values you stored: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("How many historical figures will you register ?");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[][] database = new String[n][3];

        for (int i = 0; i < database.length; i++) {

            System.out.println("\nFigure " + (i + 1));

            System.out.print("Name: ");
            database[i][0] = sc.nextLine();
            System.out.print("Date of birth: ");
            database[i][1] = sc.nextLine();
            System.out.print("Occupation: ");
            database[i][2] = sc.nextLine();
        }

        printJavaPedia(database);


        System.out.print("Who do you want information on ? ");
        String info = sc.nextLine();

        System.out.println();
        for (int i = 0; i < database.length; i++) {

            if (database[i][0].equals(info)) {

                System.out.println("Name: " + database[i][0]);
                System.out.println("Date of birth: " + database[i][1]);
                System.out.println("Occupation: " + database[i][2]);
                break;

            }


        }


    }

}
