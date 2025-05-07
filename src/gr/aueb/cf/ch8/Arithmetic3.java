package gr.aueb.cf.ch8;

import java.util.Scanner;

public class Arithmetic3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int result = 0;

        while (true) {
            System.out.println("Παρακαλώ εισάγετε δύο ακεραίους");
            num1 = scanner.nextInt();
            if (num1 == 0) break;

            num2 = scanner.nextInt();

            if (num2 == 0) {        // state test
                System.out.println("Ο παρονομαστής δεν μπορεί να είναι μηδέν");
                continue;
            }
            result = num1 / num2;
            System.out.println(result);
        }
    }
}
