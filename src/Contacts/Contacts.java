package Contacts;


import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;


public class Contacts {
    public static void main(String[] args) throws IOException {
        Input input = new Input();
        int answer = contactMenu();
        while (answer!=6){
            if(answer == 1) {
                displayAllContacts();
                if(input.yesNo("Would you like to continue? Y/N\n")) {
                    answer = contactMenu();
                }
                else {
                    answer = 6;
                }
            } else if (answer == 2) {
                getContactInfoFromUser();
                if(input.yesNo("Would you like to continue? Y/N\n")) {
                    answer = contactMenu();
                }
                else {
                    answer = 6;
                }
            } else if (answer == 3) {
                displayOneContact();
                if(input.yesNo("Would you like to continue? Y/N\n")) {
                    answer =contactMenu();
                }
                else {
                    answer = 6;
                }
            } else if (answer == 4) {
                deleteContact();
                if(input.yesNo("Would you like to continue? Y/N\n")) {
                    answer = contactMenu();
                }
                else {
                    answer = 6;
                }
            } else if (answer == 5) {
                editContact();
                if(input.yesNo("Would you like to continue? Y/N\n")) {
                    answer = contactMenu();
                }
                else {
                    answer = 6;
                }
            }
        }



    }
//checked and works
    public static void getFile() throws IOException {

        try {
            String directory = "/Users/patrickquilty/IdeaProjects/codeup-java-exercises/src/Contacts/documents/";
            String filename = "contacts.txt";

            Path dataDirectory = Paths.get(directory);
            Path dataFile = Paths.get(directory, filename);


            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }

            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }
            System.out.println("Success");
        } catch (IOException ex) {
            System.out.println(ex);
            System.out.println("Oops...resolve exception");
        }
    }
    //checked and works
    public static void addContact(Contact contact) throws IOException {
        try {
        String directory = "/Users/patrickquilty/IdeaProjects/codeup-java-exercises/src/Contacts/documents/";
        String filename = "contacts.txt";
        Path filepath = Paths.get(directory, filename);
        List<String> contactsList = List.of(contact.toString());
        Files.write(filepath, contactsList,StandardOpenOption.APPEND);
        System.out.println("User added");
        } catch (IOException ex) {
            System.out.println("Error adding contact");
        }

    }
    //checked and works
    public static void getContactInfoFromUser() throws IOException {
        Input input = new Input();
        System.out.println("Enter the name of the contact\n");
        String name = input.getString();
        System.out.println("Enter the phone number of the contact: (format:xxx-xxx-xxxx)\n");
        String phoneNumber = input.getString();
        Contact contact = new Contact(name, phoneNumber);
        addContact(contact);
    }
    //checked and works
    public static void displayAllContacts() throws IOException {
        try {
            String directory = "/Users/patrickquilty/IdeaProjects/codeup-java-exercises/src/Contacts/documents/";
            String filename = "contacts.txt";
            Path filepath = Paths.get(directory, filename);
            List<String> displayContacts = Files.readAllLines(filepath);
            System.out.println("Name | Phone number\n" +
                    "---------------");
            for (int i = 0; i < displayContacts.size(); i += 1) {
                System.out.println((i + 1) + ": " + displayContacts.get(i));
            }
        } catch  (IOException ex) {
            System.out.println("Error displaying contacts");
        }
    }
    //checked and works
    public static void deleteContact()throws IOException {
        try {
            String directory = "/Users/patrickquilty/IdeaProjects/codeup-java-exercises/src/Contacts/documents/";
            String filename = "contacts.txt";
            Path filepath = Paths.get(directory, filename);
            List<String> contactsList = Files.readAllLines(filepath);
            Input input = new Input();
            System.out.println("Enter the name of the contact you want to delete");
            String name = input.getString();
            List<String> newList = new ArrayList<>();
            for (String contact : contactsList) {
                if (contact.contains(name)) {
                    newList.remove(contact);
                    System.out.println("Contact deleted");
                    break;
                }
                newList.add(contact);
            }
            Files.write(Paths.get(directory, filename), newList);

        } catch (IOException ex) {
            System.out.println("Error deleting contact");
        }
    }
    //checked and works
    public static void displayOneContact() throws IOException {
        try {
            String directory = "/Users/patrickquilty/IdeaProjects/codeup-java-exercises/src/Contacts/documents/";
            String filename = "contacts.txt";
            Path filepath = Paths.get(directory, filename);
            List<String> contactsList = Files.readAllLines(filepath);
            Input input = new Input();
            System.out.println("Search for a contact:");
            String name = input.getString();
            for (String contact : contactsList) {
                if (contact.contains(name)) {
                    System.out.println(contact);
                    break;
                }
            }
        }
            catch (IOException ex) {
            System.out.println("Error finding contact");
        }
    }

    public static void editContact() throws IOException {
        String directory = "/Users/patrickquilty/IdeaProjects/codeup-java-exercises/src/Contacts/documents/";
        String filename = "contacts.txt";
        Path filepath = Paths.get(directory, filename);
        List<String> contactsList = Files.readAllLines(filepath);
        Input input = new Input();
        System.out.println("Enter the name of the contact:");
        String name = input.getString();
        List<String> newList = new ArrayList<>();
        for (String contact : contactsList) {
            if (contact.contains(name)) {
                System.out.println("Enter the correct name of the contact\n");
                name = input.getString();
                System.out.println("Enter the correct phone number of the contact: (format:xxx-xxx-xxxx)\n");
                String phoneNumber = input.getString();
                Contact correctedContact = new Contact(name, phoneNumber);
                newList.add(String.valueOf(correctedContact));
                continue;
            }  newList.add(contact);
        } Files.write(Paths.get(directory, filename), newList);

    }

    public static int contactMenu(){
        Input input = new Input();
        System.out.println("Welcome to your contacts manager\n");
        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Edit an existing contact.\n" +
                "6. Exit.\n" +
                "Enter an option number (ex: 1, 2...):\n");
        return input.getInt(1,6);
    }




}
