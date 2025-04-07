package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Υπολογίζει το εμβαδό ενός κύκλο σύμφωνα με τον
 * τύπο πr^2, όπου π = 3.14 , r είναι η ακτίνα.
 */
public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = 0;
        double circleArea = 0.0;

        System.out.println("Παρακαλώ δώστε την ακτίνα του κύκλου");
        radius = scanner.nextInt();
        circleArea = Math.PI * Math.pow(radius, 2);

        System.out.printf("The area of the circle with radius: %d is %.2f", radius, circleArea);
    }
}
