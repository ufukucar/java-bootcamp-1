package com.ufukucar._195_;

public class ContactManager {

    private Contact[] contacts; // array of Contact objects


    public ContactManager(Contact[] contacts) {

        this.contacts = new Contact[contacts.length];
         // System.arraycopy(contacts, 0, this.contacts, 0, contacts.length);

        for ( int i = 0; i < contacts.length; i++ ) {
            this.contacts[i] = new Contact(contacts[i]);
        }
    }


    public Contact getContact(int index) {
        // return deep copy of object at that index.
        return new Contact(contacts[index]);

    }

    public void setContact(Contact contact, int index) {
        this.contacts[index] = new Contact(contact);
    }









}
