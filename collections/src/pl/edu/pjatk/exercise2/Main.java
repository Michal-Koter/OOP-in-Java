package pl.edu.pjatk.exercise2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(countWordsAppear(text));
    }

    public static Map<String, Integer> countWordsAppear(String text) {
        String[] words = text.split(" ");
        Map<String,Integer> map = new TreeMap<>();
        for (String word: words){
            if (map.containsKey(word)){
                int count = map.get(word);
                map.put(word, ++count);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }
}
