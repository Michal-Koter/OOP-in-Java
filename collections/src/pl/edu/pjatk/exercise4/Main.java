package pl.edu.pjatk.exercise4;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = scanner.nextLine();
        System.out.println(litterCounter(text));
    }


    public static Map<String, Integer> litterCounter(String text){
        Map<String,Integer> map = new TreeMap<>();
        String[] chars = text.split("");
        for (int i=0; i < chars.length; i++){
            Pattern evenPattern = Pattern.compile("[aeouiAEIOU]", Pattern.CASE_INSENSITIVE);
            Matcher evenMatcher = evenPattern.matcher(chars[i]);
            boolean evenFound = evenMatcher.find();
            if(evenFound) {
                if (map.containsKey("even")){
                    int count = map.get("even");
                    map.put("even", ++count);
                } else {
                    map.put("even", 1);
                }
            } else {
                Pattern oddPattern = Pattern.compile("[b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z]", Pattern.CASE_INSENSITIVE);
                Matcher oddMatcher = oddPattern.matcher(chars[i]);
                boolean oddFound = oddMatcher.find();
                if(oddFound) {
                    if (map.containsKey("odd")) {
                        int count = map.get("odd");
                        map.put("odd", ++count);
                    } else {
                        map.put("odd", 1);
                    }
                }
            }
        }
        return map;
    }
}
