package pl.edu.pjatk.exercise3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Adam", "Kowalski", "s1234");
        Student student2 = new Student("Jan", "Adamski", "s2231");
        Student student3 = new Student("Maciej", "Bak", "s4687");
        Student[] students = new Student[]{student1,student2,student3};

        Arrays.sort(students, new StudentLastnameComparator());
        System.out.println(Arrays.toString(students));
    }
}
