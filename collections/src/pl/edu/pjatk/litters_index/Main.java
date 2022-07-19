package pl.edu.pjatk.litters_index;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(littersIndex(text));
    }

    public static Map<String, Set<Integer>> littersIndex(String text){
        String[] letters = text.split("");
        Map<String, Set<Integer>> index = new TreeMap<>();
        for(int i=0; i<letters.length; i++){
            if(index.containsKey(letters[i])){
                Set<Integer> position = index.get(letters[i]);
                position.add(i);
            } else {
                index.put(letters[i], new TreeSet<>(Arrays.asList(i)));
            }
        }
        return index;
    }
}
