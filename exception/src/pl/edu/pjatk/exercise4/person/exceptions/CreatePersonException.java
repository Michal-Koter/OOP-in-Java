package pl.edu.pjatk.exercise4.person.exceptions;

public class CreatePersonException extends Exception{
    @Override
    public String getMessage(){
        return "Incorrect values! Can not create new person!";
    }
}
