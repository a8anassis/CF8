package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει μίλια σε χιλιόμετρα, όπου
 * ένα μίλι = 1.6 χιλιόμετρα. Άρα, για παράδειγμα,
 * 10 μίλια = 16 χιλιόμετρα. Ο χρήστης δίνει την τιμή σε μίλια.
 */
public class MilesToKm {

    public static void main(String[] args) {

        // Δήλωση μεταβλητών και αρχικοποίηση
        Scanner scanner = new Scanner(System.in);
        double inputMiles = 0.0;
        double kilometers = 0.0;
        final double KM_PER_MILE = 1.6;

        // Εντολές
        System.out.println("Παρακαλώ εισάγετε μίλια");
        inputMiles = scanner.nextDouble();
        kilometers = inputMiles * KM_PER_MILE;

        // Εκτύπωση Αποτελέσματος
        System.out.println("Miles: " + inputMiles + ", Km: " + kilometers);
    }
}
