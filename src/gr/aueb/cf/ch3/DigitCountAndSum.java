package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει ένα ακέραιο. Το πρόγραμμα
 * υπολογίζει το πλήθος των ψηφίων του ακεραίου και
 * το άθροισμα των ψηφίων. Για παράδειγμα αν ο χρήστης
 * εισάγει τον ακέραιο 12345, τότε το πλήθος των ψηφίων
 * είναι 5 και το άθροισμα είναι 1 + 2 + 3 + 4 + 5 = 15.
 */
public class DigitCountAndSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum;
        int digitsCount = 0;
        int digitsSum = 0;
        int num;
        int rightDigit;


        System.out.println("Παρακαλώ εισάγετε ένα ακέραιο");
        inputNum = scanner.nextInt();
        num = inputNum;

        do {
            rightDigit = num % 10;
            digitsCount++;
            digitsSum += rightDigit;
            num = num / 10;
        } while (num != 0);
        System.out.println("Δώαστε τον ακέραιο: " + inputNum);
        System.out.printf("Πλήθος Ψηφίων: %d, Άθροισμα ψηφίων : %d", digitsCount, digitsSum);
    }
}
