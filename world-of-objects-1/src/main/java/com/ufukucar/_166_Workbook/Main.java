package com.ufukucar._166_Workbook;

public class Main {

    public static void main(String[] args) {

        System.out.println("************************************");

        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);

        Person twin = new Person(person);
        twin.setName("Jad Slim");
        twin.setSeatNumber(3);

        System.out.println("Name: " + person.name + "\n" + "Nationality: "
                + person.nationality + "\n" + "Date of Birth: " + person.dateOfBirth +
                "\n" + "Seat Number: " + person.seatNumber + "\n");

        System.out.println("Name: " + twin.getName() + "\n" +
                "Nationality: " + twin.getNationality() + "\n" +
                "Date of Birth: " + twin.getDateOfBirth() + "\n" +
                "Seat Number: " + twin.getSeatNumber() + "\n");

    }


}
