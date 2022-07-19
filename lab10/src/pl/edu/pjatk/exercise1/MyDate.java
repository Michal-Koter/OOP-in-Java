package pl.edu.pjatk.exercise1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyDate {
    private String format;

    public MyDate() {}

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        Pattern pattern = Pattern.compile("[dm]{2}|[dmy]{4}",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(format);
        boolean matchFound = matcher.find();
        if(matchFound) {
            this.format = format;
        } else {
            System.out.println("Incorrect date format!");
        }
    }
}
