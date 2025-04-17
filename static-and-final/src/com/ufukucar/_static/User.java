package com.ufukucar._static;

public class User {

    private String firstName;
    private String lastName;
    //public static int usercount = 0; // public olmamalı
    private static int usercount = 0; // public olmamalı

    public User(String firstName, String lastName) {
        usercount++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int getUserCount() {
        return usercount;
    }
}