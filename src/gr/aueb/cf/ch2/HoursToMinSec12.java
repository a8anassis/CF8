package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Calculates the number of minutes and seconds in a given number of hours.
 */
public class HoursToMinSec12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours;
        final int MINUTES_PER_HOUR = 60;
        final int SECONDS_PER_MINUTE = 60;
        int minutes;
        int seconds;

        System.out.println("Please enter the number of hours:");
        hours = scanner.nextInt();

        minutes = hours * MINUTES_PER_HOUR;
        seconds = minutes * SECONDS_PER_MINUTE;

        System.out.printf(Locale.forLanguageTag("el"), "%d hours = %d minutes = %d seconds", hours, minutes, seconds);
    }
}


