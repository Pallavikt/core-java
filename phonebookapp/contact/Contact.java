package com.xworkz.phonebookapp.contact;

public class Contact {

    private int contactId;
    private String contactName;
    private long phoneNumber;
    private String email;

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact(contactId = " + this.contactId + ", contactName = " + this.contactName +
                ", phoneNumber = " + this.phoneNumber + ", email = " + this.email + ")";
    }
}