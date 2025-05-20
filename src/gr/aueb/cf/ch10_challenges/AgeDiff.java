package gr.aueb.cf.ch10_challenges;

import java.util.Arrays;

public class AgeDiff {

    public static void main(String[] args) {

    }

    public static int calcAgeDiff(int[] ages, int characterAge) {
        if (ages == null || ages.length == 0) return 0;
        int maxAge = ages[0];
        int diff;

        for (int age : ages) {
            if (age > maxAge) {
                maxAge = age;
            }
        }

        diff = maxAge - characterAge;
        return (diff > 0) ? diff : 0;
    }
}


