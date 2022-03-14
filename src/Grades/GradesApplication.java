package Grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Students> students = new HashMap<>();
        Students Patrick = new Students("Patrick");
        Patrick.addGrade(90);
        Patrick.addGrade(95);
        Patrick.addGrade(85);
        Students Diplodocus = new Students("Diplodocus");
        Diplodocus.addGrade(50);
        Diplodocus.addGrade(40);
        Diplodocus.addGrade(10);
        Students Maria = new Students("Maria");
        Maria.addGrade(100);
        Maria.addGrade(98);
        Maria.addGrade(96);
        Students Sean = new Students("Winter");
        Sean.addGrade(100);
        Sean.addGrade(75);
        Sean.addGrade(90);
        students.put("pquilty79", Patrick);
        students.put("marlukash", Maria);
        students.put("notadinosuar43", Diplodocus);
        students.put("winterstorm", Sean);
        System.out.println("Welcome!\n");
        askAboutStudents(students);


    }

    public static void askAboutStudents(HashMap<String, Students> students) {
        Input input = new Input();
        do {
            System.out.println("Here are the GitHub usernames of our students:\n");
            for (String key : students.keySet()) {
                System.out.println(key);
            }
            System.out.println("or type: 'All Students'");
            System.out.println("\nWhat student would you like to see more information on?\n");
            String answer = input.getString();
            if(answer.equals("All Students")) {
                for (Students student : students.values()) {
                    System.out.println(student.toString());
                    System.out.println("Current Average: " + (int)student.getGradeAverage(student.getGrades()));
                }
                getClassAverage(students);
            } else if (students.containsKey(answer)) {
                Students newStudent = students.get(answer);
                System.out.println("Name: " + newStudent.getName() + " GitHub Username: " + answer);
                System.out.println("Grades: " + newStudent.getGrades() + " Current Average: " + (int)newStudent.getGradeAverage(newStudent.getGrades()));

            } else {
                System.out.printf("Sorry, no student found with the GitHub username of %s\n", answer);
            }

        } while (input.yesNo("Would you like to see another student?\n"));
        System.out.println("Goodbye, and have a wonderful day!");
    }

    public static void getClassAverage(HashMap<String, Students> students) {
        ArrayList<Double> gradesArrayList = new ArrayList<>();
        for (Students student : students.values()) {
            gradesArrayList.add(student.getGradeAverage(student.getGrades()));
        }
        int average = (int) getGradeAverage(gradesArrayList);
        System.out.println("Class average: " + average);

    }

    public static double getGradeAverage(ArrayList<Double> grades) {
        return grades.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }


}
