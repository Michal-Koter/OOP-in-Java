package pl.edu.pjatk.basicCalculator;

public class Calculator {
    public Calculator() {
    }

    public double calculate(double a){
        return a*a;
    }

    public double calculate(double a, double b){
        return a*b;
    }

    public double calculate(double a, double b, double c){
        return a+b+c;
    }
}
