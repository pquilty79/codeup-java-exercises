import ObjectsExercises.Person;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person Patrick = new Person("Patrick");
        Person Ludmila = new Person("Mila");
        Person Maria = new Person("Maria");
        Person Sean = new Person("Winter");


        Person[] people = {Patrick, Ludmila, Maria};

        for (Person person : people) {
            System.out.println(person.getName());
        }

        Person[] persons = addPerson(people,Sean);
        for (Person person : persons) {
            System.out.println(person.getName());
        }

    }

    public static Person[] addPerson(Person[] people, Person person) {
        Person[] persons = Arrays.copyOf(people, people.length + 1);
        persons[persons.length - 1] = person;
        return persons;
        }


}