package com.ufukucar;

import java.util.Arrays;

public class _134_Workbook {

    public static void printTicketNumbers (int [] ticket ) {

        System.out.println();
        for( int i = 0; i < ticket.length; i++) {
            System.out.print(ticket[i] + " ");
        }

         System.out.print("\n\n");

    }


    public static void main(String[] args) {

        int[] ticket = {34, 43, 45, 65, 21, 54};


        int[] ticket2 = Arrays.copyOf(ticket, ticket.length);

        ticket2[2] = 54;

        System.out.print("Ticket 1 numbers: ");
        printTicketNumbers(ticket);

        System.out.print("Ticket 2 numbers: ");
        printTicketNumbers(ticket2);




    }



}
