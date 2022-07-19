package pl.edu.pjatk.exercise4.person;

import pl.edu.pjatk.exercise4.person.exceptions.CreatePersonException;

public class Person {
    static private int currentYear = 2022;

    private String firstname;
    private String lastname;
    private int yob;

    public Person(String firstname, String lastname, int birthYear) throws CreatePersonException {
        if(firstname.isEmpty() || lastname.isEmpty()){
            throw new CreatePersonException();
        }
        this.firstname = firstname;
        this.lastname = lastname;
        this.yob = birthYear;
    }

    @Override
    public String toString(){
        return "I am "+firstname+" "+lastname+". I am "+(currentYear-yob)+" years old.";
    }
}
