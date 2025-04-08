package com.ufukucar;

import java.util.Arrays;

public class _135_TDarrays {

    public static void main(String[] args) {


        /**
         *  int [][] grades = new int [3][4];
         grades [0][0] = 72;
         grades [0][1] = 74;
         grades [0][2] = 78;
         grades [0][3] = 76;

         grades [1][0] = 65;
         grades [1][1] = 64;
         grades [1][2] = 61;
         grades [1][3] = 67;

         grades [2][0] = 95;
         grades [2][1] = 98;
         grades [2][2] = 99;
         grades [2][3] = 100;
         */

        int[][] grades = {
                {72, 74, 78, 76},
                {65, 64, 61, 67},
                {95, 98, 99, 100}
        };
        System.out.println("\tHarray: " + Arrays.toString(grades[0]));
        System.out.println("\tRon: " + Arrays.toString(grades[1]));
        System.out.println("\tHermione: " + Arrays.toString(grades[2]));

        System.out.println("**********************************");
        System.out.println("\tHarray: " + grades[0][0] + " " + grades[0][1] + " " + grades[0][2]);
        System.out.println("\tRon: " +  grades[1][0] + " " + grades[1][1] + " " + grades[1][2]);
        System.out.println("\tHermione: " +  grades[2][0] + " " + grades[2][1] + " " + grades[2][2]);
    }

}
