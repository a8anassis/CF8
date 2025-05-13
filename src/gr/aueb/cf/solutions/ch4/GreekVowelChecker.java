package gr.aueb.cf.solutions.ch4;

import java.util.Scanner;

public class GreekVowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input;
        boolean isVowel;
        char ch;

        System.out.print("Εισάγετε ένα ελληνικό χαρακτήρα: ");
        input = scanner.next().charAt(0);
        ch = Character.toUpperCase(input);

        isVowel = switch (ch) {
            case 'Α', 'Ε', 'Η', 'Ι', 'Ο', 'Υ', 'Ω' -> true;
            default -> false;
        };

        System.out.println("Είναι φωνήεν: " + isVowel);
    }
}

