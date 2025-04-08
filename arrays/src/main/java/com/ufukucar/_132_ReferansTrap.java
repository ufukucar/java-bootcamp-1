package com.ufukucar;

import java.util.Arrays;

public class _132_ReferansTrap {

    public static void main(String[] args) {

        String [] staffLastYear = { "Tommy", "Joel", "Ellie" };

        // String [] staffThisYear = staffLastYear;

        //staffThisYear [1] = "Abby";

        // Referans tuzağından kaçmak için yeni bir array oluştur ve değerleri tek tek ona ata
        /*
            String [] staffThisYear = new String [3];
            for (int i = 0; i < 3; i++) {
                staffThisYear[i] = staffLastYear[i];
            }
            staffThisYear [1] = "Abby";
         */


        // Ya da Arrays.copyOf(kopyalanacakDizi, array.length). Daha iyi bir çözüm.
        String [] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length );

        staffThisYear [1] = "Abby";

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));


    }

}
