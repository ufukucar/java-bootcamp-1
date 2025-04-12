package com.ufukucar._181_Workbook;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Person[] people = new Person[]{
                new Person("Cleopatra", "Egypt", "69 BC", 1),
                new Person("Alexander The Great", "Macedon", "356 BC", 2),
                new Person("Julius Caesar", "Rome", "100 BC", 3),
                new Person("Hannibal", "Carthage", "247 BC", 4),
                new Person("Confucius", "Chine", "551 BC", 5),
                new Person("Pericles", "Greece", "429 BC", 6),
                new Person("Spartacus", "Thrace", "111 BC", 7),
                new Person("Marcus Aurelius", "Rome", "121 BC", 8),
                new Person("Leonidas", "Greece", "540 BC", 9),
                new Person("Sun Tzu", "China", "544 BC", 10),
               // new Person("Hammurabi", "Babylon", "1750 BC", 11),
                new Person("Hammurabi", "Babylon", "1750 BC", 10),
        };


        Airline airline = new Airline();

        for (int i = 0; i < people.length; i++) {

            boolean passportApproved = people[i].applyPassport();

            if ( passportApproved) {
                airline.createReservation(people[i]);
            }else {
                System.out.println("Sorry " + people[i].getName() + ". Your passport " + Arrays.toString(people[i].getPassport()) + " is not valid. \n");
            }

        }



    }


}


