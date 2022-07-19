package pl.edu.pjatk.exercise4;

import pl.edu.pjatk.exercise4.person.Person;
import pl.edu.pjatk.exercise4.person.exceptions.CreatePersonException;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.println("Enter firstname: ");
            String firstname = scanner.nextLine();
            System.out.println("Enter lastname: ");
            String lastname = scanner.nextLine();
            System.out.println("Enter birth year: ");
            int year = scanner.nextByte();

            try {
                Person person = new Person(firstname, lastname, year);
                break;
            } catch (CreatePersonException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
