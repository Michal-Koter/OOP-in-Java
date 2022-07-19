package pl.edu.pjatk.exercise1;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        int a = number();
        System.out.println("Enter second number: ");
        int b = number();
        System.out.println("Enter aromatic operator: ");
        String operation = null;
        while(operation == null) {
            try {
                operation = inputOperation();
            } catch (OperationException e) {
                System.out.println(e.getMessage());
                System.out.println("Try again.");

            }
        }


    }

    public static int number(){
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Incorrect number! Try again.");
            return number();
        }
    }

    public static String inputOperation() throws OperationException {
        String input = scanner.nextLine();
        switch (input){
            case "+":
            case "-":
            case "*":
            case "/":
                return input;
            default:
                throw new OperationException();
                
        }
    }
}
