package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the weight in grams of a given weight in kilos.
 */
public class KiloToGrams11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilos;
        final int GRAMS_PER_KG = 1000;
        int totalGrams;

        System.out.println("Please enter the weight in kilos:");
        kilos = scanner.nextInt();

        totalGrams = kilos * GRAMS_PER_KG;

        System.out.printf("The weight in grams of %d kilos is: %d", kilos, totalGrams);
    }
}
