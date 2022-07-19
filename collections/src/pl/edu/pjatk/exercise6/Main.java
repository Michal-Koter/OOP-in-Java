package pl.edu.pjatk.exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = scanner.nextLine();
        String[] words = text.split("[ ,.]+");
        List<String> list = new ArrayList<>(Arrays.asList(words));
        System.out.println(onlyEvenIndex(list));
    }

    public static List<String> onlyEvenIndex(List<String> list){
        List<String> newList = new ArrayList<>();
        for(int i=0; i<list.size();i+=2){
            newList.add(list.get(i));
        }
        return newList;
    }
}
