package GroceryList;

import util.input;

import java.util.ArrayList;
import java.util.Collections;

public class GroceryListApp {
    public static void groceryList(ArrayList<Groceries> groceriesArrayList){
        input input = new input();
        while (input.yesNo("Would you like to add an item to the grocery list?\n")) {
                addItemToList(groceriesArrayList);
            }
        if(groceriesArrayList.size() != 0){
            getSortedGroceriesByName(groceriesArrayList);
            for (Groceries grocery : groceriesArrayList) {
                System.out.println("Item: " + grocery.getName() + " | Category: " + grocery.getCategory() + " | Quantity: " + grocery.getQuantity());
            }

        } else {
            System.out.println("Your list is empty");
            }
    }
    public static void addItemToList(ArrayList<Groceries> groceriesArrayList) {
        input input = new input();
        System.out.println("Enter an item:\n");
        String listItemName = input.getString();
        System.out.println("Pick a category:\n");
        System.out.println("Fruits | Vegetables | Meat | Dairy | Bread | Seafood | Pet Food |\n" +
                "Paper Products | Beverages | Desserts | Frozen Food | Canned Food |\n" +
                "Household Products | Personal Hygiene | Analgesics | Prophylactics |\n" +
                "First Aid | Antihistamines | Incontinence | Vitamins | Appliances | Spam |\n");
        String listItemCategory = input.getString();
        System.out.println("How many do you need?\n");
        int listItemQuantity = input.getInt();
        Groceries grocery;
        if (input.yesNo("Is this correct?\n" + listItemName + ", " + listItemCategory + ", " + listItemQuantity + ".\n")) {
            grocery = new Groceries(listItemName, listItemCategory, listItemQuantity);
            groceriesArrayList.add(grocery);
        } else {
            addItemToList(groceriesArrayList);
        }
    }
    public static void getSortedGroceriesByName(ArrayList<Groceries> groceriesArrayList) {
        Collections.sort(groceriesArrayList, Groceries.nameComparator);
        Collections.sort(groceriesArrayList, Groceries.categoryComparator);
    }


    public static void main(String[] args) {
        ArrayList<Groceries> groceriesArrayList = new ArrayList<>();
        groceryList(groceriesArrayList);
    }

}
