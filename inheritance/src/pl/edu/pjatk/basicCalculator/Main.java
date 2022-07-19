package pl.edu.pjatk.basicCalculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(4));
        System.out.println(calculator.calculate(4,5));
        System.out.println(calculator.calculate(3,4,5));
    }
}