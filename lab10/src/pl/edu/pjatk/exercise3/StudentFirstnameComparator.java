package pl.edu.pjatk.exercise3;

import java.util.Comparator;

public class StudentFirstnameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFirstname().compareTo(o2.getFirstname());
    }
}
