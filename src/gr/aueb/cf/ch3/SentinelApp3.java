package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει για πάντα και όταν βρει τον 'sentinel'
 * διακόπτει το loop. Η διακοπή και έξοδος από μία
 * επαναληπτική δομή γίνεται με break.
 */
public class SentinelApp3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        while (true) {
            System.out.println("Παρακαλώ εισάγετε ένα ακέραιο (-1 για έξοδο)");
            num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            iterations++;
        }

        System.out.println("Το πλήθος των επαναλήψεων είναι: " + iterations);
    }
}
