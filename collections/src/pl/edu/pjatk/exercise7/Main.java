package pl.edu.pjatk.exercise7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = scanner.nextLine();
        System.out.println(uniqueCharNum(text));
    }

    public static int uniqueCharNum(String text){
        String[] chars = text.split("");
        Set<String> list = new HashSet<>(Arrays.asList(chars));
        return list.size();
    }
}
