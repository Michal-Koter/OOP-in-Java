package pl.edu.pjatk.exercise3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String operation = null;
        while(operation == null) {
            try {
                System.out.println("Enter number of operation:");
                System.out.println("1. +");
                System.out.println("2. -");
                System.out.println("3. *");
                System.out.println("4. /");
                operation = inputOperation();
            } catch (OperationException e) {
                System.out.println(e.getMessage());
                System.out.println("Try again.");
            } catch (InputMismatchException e){
                System.out.println(e.getMessage());
                System.out.println("Try again.");
            }
        }
        System.out.println("Enter first number:");
        int a = number();
        System.out.println("Enter second number:");
        int b = number();
        double result = 0;
        switch (operation){
            case "add":
                result = a + b;
                break;
            case "sum":
                result = a - b;
                break;
            case "mul":
                result = a * b;
                break;
            case "div":
                result = (double)a / b;
        }

        System.out.println("Result of " + operation + " numbers " + a + " and " + b + " is equal " + result);

    }

    public static int number(){
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Incorrect number! Try again.");
            return number();
        }
    }

    public static String inputOperation() throws OperationException{
        int input = number();
        switch (input){
            case 1:
                return "add";
            case 2:
                return "sum";
            case 3:
                return "mul";
            case 4:
                return "div";
            default:
                throw new OperationException();
        }
    }
}
