package pl.edu.pjatk.exercise1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a form of date: ");
        String form = scanner.nextLine();
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(form);
        String formattedDate= date.format(formatter);
        System.out.println(formattedDate);
    }
}

