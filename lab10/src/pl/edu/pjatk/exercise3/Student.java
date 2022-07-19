package pl.edu.pjatk.exercise3;

public class Student{
    private String firstname;
    private String lastname;
    private String index;

    public Student(String firstname, String lastname, String index) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.index = index;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", index='" + index + '\'' +
                '}';
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getIndex() {
        return index;
    }
}
