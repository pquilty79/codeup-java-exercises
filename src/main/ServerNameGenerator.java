import ObjectsExercises.Person;

public class ServerNameGenerator {
    static String [] adjectives = {"short", "fat", "tall", "skinny", "old", "young", "red", "green", "blue", "gold"};
    static String [] nouns = {"girl", "boy", "man", "woman", "car", "horse", "dog", "cat", "bird", "aardvark"};

    public static String randomWords(String[] arrayOne, String[] arrayTwo) {
        String wordOne = arrayOne[(int) Math.ceil(Math.random() * 10)-1];
        String wordTwo = arrayTwo[(int) Math.ceil(Math.random() * 10)-1];
        String words = wordOne + "-" + wordTwo;
        System.out.println(words);
        return words;
    }

    public static void main(String[] args) {
        randomWords(adjectives, nouns);


    }






}
