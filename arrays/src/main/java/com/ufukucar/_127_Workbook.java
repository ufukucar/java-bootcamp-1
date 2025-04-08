package com.ufukucar;

public class _127_Workbook {

    public static void main(String[] args) {

        String[] records = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};

        int wins = 0;
        int loss = 0;

        for ( String record : records ) {

            if ( record.equals("WIN") ) {
                wins++;
            }

            if ( record.equals("LOSS") ) {
                loss++;
            }
        }

        System.out.println("Java RingAnnouncer");

        System.out.println("With a professional record of " + wins + " winds and " + loss + " losses");

        System.out.println("He is the pride of oracle: Java Fury!");



    }



}
