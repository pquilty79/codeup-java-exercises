package Movies;
import util.Input;

import java.util.Arrays;

import static Movies.MoviesArray.findAll;
public class MoviesApplication {
    public static Movie[] addMovie(Movie[] array) {
        Input input = new Input();
        System.out.println("Enter the name of the new movie");
        String movieName = input.getString();
        System.out.println("Enter the category of the new movie");
        String movieCategory = input.getString();
        System.out.println("Movie has been added");
        Movie newMovie = new Movie(movieName, movieCategory);
        Movie[] newerArray = Arrays.copyOf(array, array.length + 1);
        newerArray[newerArray.length - 1] = newMovie;
        return newerArray;
    }

    public static void displayByCategory(Movie[] array, String category) {
        for (Movie movie : array) {
            if(movie.getCategory().equals(category)) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }  displayMovies(array);
    }

    public static void displayMovies(Movie[] newArray) {
        Input input = new Input();
        System.out.println("What would you like to do?\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - view movies in the comedy category\n" +
                "7 - add a movie\n" +
                "Enter your choice:");
        int choice = input.getInt(0, 7);
        while (choice != 0 ) {
            if (choice == 1) {
                for (Movie movie : newArray) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }  displayMovies(newArray);
            } else if (choice == 2) {
                displayByCategory(newArray, "animated");
            } else if (choice == 3) {
                displayByCategory(newArray, "drama");
            } else if (choice == 4) {
                displayByCategory(newArray, "horror");
            } else if (choice == 5) {
                displayByCategory(newArray, "scifi");
            } else if (choice == 6) {
                displayByCategory(newArray, "comedy");
            } else if (choice == 7) {
                newArray = addMovie(newArray);
                for (Movie movie : newArray) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
                System.out.println("What would you like to do?\n" +
                        "0 - exit\n" +
                        "1 - view all movies\n" +
                        "2 - view movies in the animated category\n" +
                        "3 - view movies in the drama category\n" +
                        "4 - view movies in the horror category\n" +
                        "5 - view movies in the scifi category\n" +
                        "6 - view movies in the comedy category\n" +
                        "7 - add a movie\n" +
                        "Enter your choice:");
                choice = input.getInt(0, 6);
            }
        }
    }

    public static void main(String[] args) {
        Movie[] newArray = findAll();
        displayMovies(newArray);
    }
}
