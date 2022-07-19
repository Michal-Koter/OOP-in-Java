package pl.edu.pjatk.exercise3;

public class OperationException extends Exception{
    @Override
    public String getMessage(){
        return "Incorrect number of arithmetic operation!";
    }
}