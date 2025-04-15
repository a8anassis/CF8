package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Conditional assignment with Switch expression.
 */
public class SwitchExprApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade;
        char classification;

        System.out.println("Παρακαλώ εισάγετε το βαθμό");
        grade = scanner.nextInt();

        classification = switch (grade) {
            case 1, 2, 3, 4 -> 'F';
            case 5, 6 -> 'G';
            case 7, 8 -> 'V';
            case 9, 10 -> 'E';
            default -> '?';
        };

        System.out.println(classification);
    }
}
