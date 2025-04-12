package com.ufukucar._180_Workbook;

import java.util.Arrays;

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
}
