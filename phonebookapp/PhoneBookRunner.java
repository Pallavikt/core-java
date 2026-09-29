package com.xworkz.phonebookapp;

import com.xworkz.phonebookapp.contact.Contact;
import com.xworkz.phonebookapp.phonebook.PhoneBook;

public class PhoneBookRunner {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        Contact contact = new Contact();
        contact.setContactId(1);
        contact.setContactName("Pallavi");
        contact.setPhoneNumber(9876543210L);
        contact.setEmail("pallavi@gmail.com");
        phoneBook.addContact(contact);

        Contact contact1 = new Contact();
        contact1.setContactId(2);
        contact1.setContactName("Ananya");
        contact1.setPhoneNumber(9876543211L);
        contact1.setEmail("ananya@gmail.com");
        phoneBook.addContact(contact1);

        Contact contact2 = new Contact();
        contact2.setContactId(3);
        contact2.setContactName("Kavya");
        contact2.setPhoneNumber(9876543212L);
        contact2.setEmail("kavya@gmail.com");
        phoneBook.addContact(contact2);

        Contact contact3 = new Contact();
        contact3.setContactId(4);
        contact3.setContactName("Rahul");
        contact3.setPhoneNumber(9876543213L);
        contact3.setEmail("rahul@gmail.com");
        phoneBook.addContact(contact3);

        Contact contact4 = new Contact();
        contact4.setContactId(5);
        contact4.setContactName("Sneha");
        contact4.setPhoneNumber(9876543214L);
        contact4.setEmail("sneha@gmail.com");
        phoneBook.addContact(contact4);

        Contact contact5 = new Contact();
        contact5.setContactId(6);
        contact5.setContactName("Kiran");
        contact5.setPhoneNumber(9876543215L);
        contact5.setEmail("kiran@gmail.com");
        phoneBook.addContact(contact5);

        Contact contact6 = new Contact();
        contact6.setContactId(7);
        contact6.setContactName("Aishwarya");
        contact6.setPhoneNumber(9876543216L);
        contact6.setEmail("aishwarya@gmail.com");
        phoneBook.addContact(contact6);

        Contact contact7 = new Contact();
        contact7.setContactId(8);
        contact7.setContactName("Arjun");
        contact7.setPhoneNumber(9876543217L);
        contact7.setEmail("arjun@gmail.com");
        phoneBook.addContact(contact7);

        Contact contact8 = new Contact();
        contact8.setContactId(9);
        contact8.setContactName("Meghana");
        contact8.setPhoneNumber(9876543218L);
        contact8.setEmail("meghana@gmail.com");
        phoneBook.addContact(contact8);

        Contact contact9 = new Contact();
        contact9.setContactId(10);
        contact9.setContactName("Rohan");
        contact9.setPhoneNumber(9876543219L);
        contact9.setEmail("rohan@gmail.com");
        phoneBook.addContact(contact9);

        Contact contact10 = new Contact();
        contact10.setContactId(11);
        contact10.setContactName("Nandini");
        contact10.setPhoneNumber(9876543220L);
        contact10.setEmail("nandini@gmail.com");
        phoneBook.addContact(contact10);

        Contact contact11 = new Contact();
        contact11.setContactId(12);
        contact11.setContactName("Varun");
        contact11.setPhoneNumber(9876543221L);
        contact11.setEmail("varun@gmail.com");
        phoneBook.addContact(contact11);

        Contact contact12 = new Contact();
        contact12.setContactId(13);
        contact12.setContactName("Divya");
        contact12.setPhoneNumber(9876543222L);
        contact12.setEmail("divya@gmail.com");
        phoneBook.addContact(contact12);

        Contact contact13 = new Contact();
        contact13.setContactId(14);
        contact13.setContactName("Akash");
        contact13.setPhoneNumber(9876543223L);
        contact13.setEmail("akash@gmail.com");
        phoneBook.addContact(contact13);

        Contact contact14 = new Contact();
        contact14.setContactId(15);
        contact14.setContactName("Pooja");
        contact14.setPhoneNumber(9876543224L);
        contact14.setEmail("pooja@gmail.com");
        phoneBook.addContact(contact14);

        Contact contact15 = new Contact();
        contact15.setContactId(16);
        contact15.setContactName("Manoj");
        contact15.setPhoneNumber(9876543225L);
        contact15.setEmail("manoj@gmail.com");
        phoneBook.addContact(contact15);

        Contact contact16 = new Contact();
        contact16.setContactId(17);
        contact16.setContactName("Deepa");
        contact16.setPhoneNumber(9876543226L);
        contact16.setEmail("deepa@gmail.com");
        phoneBook.addContact(contact16);

        Contact contact17 = new Contact();
        contact17.setContactId(18);
        contact17.setContactName("Vikas");
        contact17.setPhoneNumber(9876543227L);
        contact17.setEmail("vikas@gmail.com");
        phoneBook.addContact(contact17);

        Contact contact18 = new Contact();
        contact18.setContactId(19);
        contact18.setContactName("Swathi");
        contact18.setPhoneNumber(9876543228L);
        contact18.setEmail("swathi@gmail.com");
        phoneBook.addContact(contact18);

        Contact contact19 = new Contact();
        contact19.setContactId(20);
        contact19.setContactName("Pranav");
        contact19.setPhoneNumber(9876543229L);
        contact19.setEmail("pranav@gmail.com");
        phoneBook.addContact(contact19);

        Contact contact20 = new Contact();
        contact20.setContactId(21);
        contact20.setContactName("Shreya");
        contact20.setPhoneNumber(9876543230L);
        contact20.setEmail("shreya@gmail.com");
        phoneBook.addContact(contact20);

        Contact contact21 = new Contact();
        contact21.setContactId(22);
        contact21.setContactName("Aditya");
        contact21.setPhoneNumber(9876543231L);
        contact21.setEmail("aditya@gmail.com");
        phoneBook.addContact(contact21);

        phoneBook.getAllContacts();
    }
}