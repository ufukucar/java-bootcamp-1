package com.ufukucar._224_Part1;

public class Main {
    public static void main(String[] args) {


        Magazine magazine1 = new Magazine("Magazine 1", "Publisher 1", 1, 2020);
        System.out.println(magazine1.getTitle());

        // Uncomment the following line to test invalid input for setTitle method
         magazine1.setTitle("Magazine 2");

        // Uncomment the following line to test invalid input for setPublisher method
         magazine1.setPublisher("Publisher 2");

        // Uncomment the following line to test invalid input for setIssueNumber method
         magazine1.setIssueNumber(5);

        // Uncomment the following line to test invalid input for setPublicationYear method
         magazine1.setPublicationYear(10);

        // Uncomment the following line to test invalid input for the constructor
         Magazine magazine2 = new Magazine("Magazine 7", "Publisher 2", 2, 2020);


    }
}