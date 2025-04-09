package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εκφράζει τη λογική της do-while αλλά με
 * τη χρήση αέναου while-do και sentinel.
 */
public class MenuApp2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EXIT = 3;
        int choice;

        while (true) {
            System.out.println("Παρακαλώ επιλέξτε ένα από τα παρακάτω:");
            System.out.println("1. Εισαγωγή Προϊόντος");
            System.out.println("2. Διαγραφή προϊόντος");
            System.out.println("3. Έξοδος");
            choice = scanner.nextInt();
            if (choice == EXIT) break;
        }
        System.out.println("Ευχαριστούμε για τη χρήση της εφαρμογής!!");
    }
}
