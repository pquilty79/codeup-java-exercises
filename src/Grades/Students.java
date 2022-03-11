package Grades;

import java.util.ArrayList;

public class Students {
    private final String name;

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    private ArrayList<Integer> grades;

    public Students(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage(ArrayList<Integer> grades) {
        return grades.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        Students Patrick = new Students("Patrick");
        Patrick.addGrade(90);
        Patrick.addGrade(95);
        Patrick.addGrade(100);
        System.out.println(Patrick.getGrades());
        System.out.println(Patrick.getGradeAverage(Patrick.getGrades()));


    }
}
