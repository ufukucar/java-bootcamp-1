package com.ufukucar._180_Workbook;

public class Airline {

    Person[] people;

    public Airline() {
        this.people = new Person[11];
    }

    public Person getPerson(int index) {
        Person person = people[index];
        return new Person(person);
    }

    public void setPerson(Person person) {

        int index = person.getSeatNumber() - 1;
        people[index] = new Person(person);

    }

}
