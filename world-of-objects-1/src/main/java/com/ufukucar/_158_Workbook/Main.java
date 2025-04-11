package com.ufukucar._158_Workbook;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("************************************");

        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", new String[]{"Rayan Slim", "Canadian", "01/01/1111"}, 5);

        System.out.println("Name: " + person.name + "\n" + "Nationality: "
                + person.nationality + "\n" + "Date of Birth: " + person.dateOfBirth +
                "\n" + "Seat Number: " + person.seatNumber + "\n");

    }


}
