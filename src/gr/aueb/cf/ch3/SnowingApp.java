package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει 1) αν βρέχει και 2) τη
 * θερμοκρασία και το πρόγραμμα αποφασίσει αν
 * χιονίζει με βάση τη λογική συνθήκη πως χιονίζει
 * αν και βρέχει και η θερμοκρασία είναι < 0.
 */
public class SnowingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false;
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Παρακαλώ εισάγετε αν βρέχει (true/false)");
        isRaining = scanner.nextBoolean();

        System.out.println("Παρακαλώ εισάγετε τη θερμοκρασία");
        temp = scanner.nextInt();

        isSnowing = isRaining && (temp < 0);

        System.out.println("Is Snowing: " + isSnowing);
    }
}
