package gr.aueb.cf.ch7;

import java.util.Scanner;

public class StringTrim {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname;

        System.out.println("Εισάγετε το όνομά σας");
        firstname = scanner.nextLine().trim();

        System.out.println(firstname);
    }
}
