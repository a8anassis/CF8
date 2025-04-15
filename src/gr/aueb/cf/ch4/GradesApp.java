package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ένα βαθμό από 1-10
 * και το πρόγραμμα εμφανίζει κατάλληλο μήνυμα,
 * όπως Άριστα (9, 10), Πολύ καλά (7, 8), Καλώς (5, 6)
 * και Αποτυχία (1-4).
 */
public class GradesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade;

        System.out.println("Παρακαλώ εισάγετε το βαθμό");
        grade = scanner.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Αποτυχία");
                break;
            case 5:
            case 6:
                System.out.println("Καλώς");
                break;
            case 7:
            case 8:
                System.out.println("Πολύ Καλά");
                break;
            case 9:
            case 10:
                System.out.println("Άριστα");
                break;
            default:
                System.out.println("Παρακαλώ δώστε αριθμό 1 - 10");
                break;
        }
    }
}
