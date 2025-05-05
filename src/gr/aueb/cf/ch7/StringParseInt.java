package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Μετατρέπει ένα String σε int.
 */
public class StringParseInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        String s;

        System.out.println("Παρακαλώ εισάγετε ένα ακέραιο");
        s = scanner.nextLine();
        num = Integer.parseInt(s);

        System.out.println(num);
    }
}
