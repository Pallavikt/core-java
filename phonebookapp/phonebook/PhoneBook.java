package com.xworkz.phonebookapp.phonebook;

import com.xworkz.phonebookapp.contact.Contact;

public class PhoneBook {

    private Contact[] contacts = new Contact[22];
    int index;

    public boolean addContact(Contact contact) {

        boolean isAdded = false;
        boolean isContactIdValid = false;
        boolean isContactNameValid = false;
        boolean isPhoneNumberValid = false;
        boolean isEmailValid = false;

        int contactId = contact.getContactId();

        if (contactId > 0) {
            isContactIdValid = true;
        } else {
            System.out.println("Contact Id is Invalid");
        }

        String contactName = contact.getContactName();

        if (contactName != null && !contactName.isEmpty()) {
            isContactNameValid = true;
        } else {
            System.out.println("Contact Name is Invalid");
        }

        long phoneNumber = contact.getPhoneNumber();

        if (phoneNumber > 0) {
            isPhoneNumberValid = true;
        } else {
            System.out.println("Phone Number is Invalid");
        }

        String email = contact.getEmail();

        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Email is Invalid");
        }

        if (isContactIdValid && isContactNameValid && isPhoneNumberValid && isEmailValid) {

            contacts[index++] = contact;
            isAdded = true;
        }

        return isAdded;
    }

    public void getAllContacts() {

        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}