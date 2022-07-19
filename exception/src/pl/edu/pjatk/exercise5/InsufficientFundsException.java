package pl.edu.pjatk.exercise5;

public class InsufficientFundsException extends Exception{
    @Override
    public String getMessage(){
        return "Not enough money on account";
    }
}
