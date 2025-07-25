package gr.aueb.cf.ch19.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReluctantPattern {

    public static void main(String[] args) {
        String s = "login;alice;pass;12345;";

        Pattern pattern = Pattern.compile(".*?;");  // as little as possible - non-greedy, reluctant
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
