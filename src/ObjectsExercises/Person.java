package ObjectsExercises;

public class Person {
    public Person(String name) {
        this.name = name;
    }

    private String name;


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        Person patrick = new Person("Patrick");
        patrick.setName("Patrick");
        patrick.sayHello();

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName())); //true
        System.out.println(person1 == person2); //false


        person2 = person1;
        System.out.println(person1 == person2); //true
        person1 = new Person("John");
        person2 = person1;
        System.out.println(person1.getName()); //John
        System.out.println(person2.getName()); //John
        person2.setName("Jane");
        System.out.println(person1.getName()); //Jane
        System.out.println(person2.getName()); //Jane


    }
}
