package pl.edu.pjatk.exercise5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size()<10){
            numbers.add(getNum(scanner));
        }
        int sum = 0;
        for(Integer num : numbers){
            sum+=num;
        }
        System.out.println(numbers);
        System.out.println("Sum of entered numbers: "+ sum);
    }

    public static int getNum(Scanner scanner){
        System.out.println("Enter the number");
        String text = scanner.nextLine();
        try{
            return Integer.parseInt(text);
        } catch (NumberFormatException e){
            System.out.println("Entered incorrect number!");
            return getNum(scanner);
        }
    }
}
