package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Απλός αριθμητικός υπολογιστής με μεθόδους.
 */
public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        int result;

        while (true) {
            printMenu();
            choice = getOneInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Λάθος επιλογή. Η επιλογή πρέπει να είναι μεταξύ 1-6. Προσπαθήστε ξανά.");
                continue;
            }

            if (isExit(choice)) {
                System.out.println("Έξοδος....");
                break;
            }
        }
    }


    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Υπόλοιπο Διαίρεσης");
        System.out.println("6. Έξοδος");
    }

    public static int getOneInt() {
        return scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice) {
//        if (choice >= 1 && choice <= 6) {
//            return true;
//        } else {
//            return false;
//        }
        return choice >= 1 && choice <= 6;
    }

    public static boolean isExit(int choice) {
        return choice == 6;
    }
}
