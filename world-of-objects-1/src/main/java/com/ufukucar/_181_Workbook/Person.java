package com.ufukucar._181_Workbook;

import java.util.Arrays;
import java.util.StringJoiner;

public class Person {

    String name;
    String nationaity;
    String dateOfBirth;
    String[] passport;
    int seatNumber;

    public Person(String name, String nationaity, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationaity = nationaity;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];
    }

    public Person (Person source) {

        this.name = source.name;
        this.nationaity = source.nationaity;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
        this.passport = Arrays.copyOf(source.passport, source.passport.length);

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationaity() {
        return nationaity;
    }

    public void setNationaity(String nationaity) {
        this.nationaity = nationaity;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String[] getPassport() {
        return Arrays.copyOf(passport, passport.length);
    }

    public void setPassport(String[] passport) {
        this.passport = passport;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }


    public boolean applyPassport() {
        int number = (int) (Math.random() * 2);

        return number == 1;
    }

    public void chooseSeat() {
        seatNumber = ((int) (Math.random() * 11 + 1));
    }


    @Override
    public String toString() {

        return "Name: " + name +  "\n"+ "Nationaity: " +
                nationaity + "\n" +  "Date of Birth: " +
                dateOfBirth +  "\n" + "Seat number: " +
                seatNumber + "\n" +  "Passport: " +
                Arrays.toString(passport);
    }


}
