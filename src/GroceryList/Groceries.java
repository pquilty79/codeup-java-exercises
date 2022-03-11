package GroceryList;
import java.util.Comparator;

public class Groceries {
        private String name;
        private String category;
        private int quantity;

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public Groceries(String name, String category, int quantity) {
            this.name = name;
            this.category = category;
            this.quantity = quantity;
        }

    public static Comparator<Groceries> nameComparator = new Comparator<Groceries>() {
        @Override
        public int compare(Groceries gr1, Groceries gr2) {
            return (int) (gr1.getName().compareTo(gr2.getName()));
        }
    };

    public static Comparator<Groceries> categoryComparator = new Comparator<Groceries>() {
        @Override
        public int compare(Groceries gr1, Groceries gr2) {
            return (int) (gr1.getCategory().compareTo(gr2.getCategory()));
        }
    };


    @Override
    public String toString() {
        return " Name: " + this.name + ", Category: " + this.getCategory() + ", Quantity:" + this.quantity;
    }


}
