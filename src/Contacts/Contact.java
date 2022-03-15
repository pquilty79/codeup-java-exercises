package Contacts;

import java.util.Objects;

public class Contact {
    private String name;

    @Override
    public String toString() {
        return "Contact " +
                "name = " + name +
                " | phone number = " + phoneNumber;
    }

    private String phoneNumber;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public Contact(String name, String phoneNumber) {
        if (name.length() < 4) {
            throw new IllegalArgumentException("Contact cannot be created because name is too short.");
        }
        if (phoneNumber.length() < 8) {
            throw new IllegalArgumentException("Contact cannot be created because phone number is too short.");
        }
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return Objects.equals(phoneNumber, contact.phoneNumber) && name.equals(contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }
}
