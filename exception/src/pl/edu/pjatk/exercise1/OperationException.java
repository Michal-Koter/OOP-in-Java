package pl.edu.pjatk.exercise1;

public class OperationException extends Exception{
    @Override
    public String getMessage(){
        return "Incorrect aromatic operator!";
    }
}
