package Contacts;


import util.Input;
import java.io.IOException;
import static Contacts.ContactActions.*;


public class ContactsApp {
    public static void main(String[] args) throws IOException {
        Input input = new Input();
        int answer = contactMenu();
        while (answer != 6) {
            if (answer == 1) {
                displayAllContacts();
                if (input.yesNo("Would you like to do anything else? Y/N\n")) {
                    answer = contactMenu();
                } else {
                    answer = 6;
                }
            } else if (answer == 2) {
                getContactInfoFromUser();
                if (input.yesNo("Would you like to do anything else? Y/N\n")) {
                    answer = contactMenu();
                } else {
                    answer = 6;
                }
            } else if (answer == 3) {
                displayOneContact();
                if (input.yesNo("Would you like to do anything else? Y/N\n")) {
                    answer = contactMenu();
                } else {
                    answer = 6;
                }
            } else if (answer == 4) {
                deleteContact();
                if (input.yesNo("Would you like to do anything else? Y/N\n")) {
                    answer = contactMenu();
                } else {
                    answer = 6;
                }
            } else if (answer == 5) {
                editContact();
                if (input.yesNo("Would you like to do anything else? Y/N\n")) {
                    answer = contactMenu();
                } else {
                    answer = 6;
                }
            }
        }


    }
}
