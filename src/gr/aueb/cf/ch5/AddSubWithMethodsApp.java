package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το άθροισμα δύο ακεραίων
 * με τη χρήση μεθόδων.
 */
public class AddSubWithMethodsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int sum;
        int sub;

        System.out.println("Παρακαλώ εισάγετε δύο ακεραίους");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        sum = add(num1, num2);      // invoke - call the add method
        sub = sub(num2, num1);

        System.out.println("Sum: " + sum);
        System.out.println("Sub: " + sub);
    }

    /**
     * Adds two integers.
     *
     * @param a     the first integer to add.
     * @param b     the second integer to add.
     * @return      the sum of a and b.
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts two integers.
     *
     * @param a     the first integer to subtract from.
     * @param b     the second integer that is subtracted.
     * @return      the subtraction of a - b.
     */
    public static int sub(int a, int b) {
        return a - b;
    }

//    public static int add(int a, int b) {
//        int sum = 0;
//        sum = a + b;
//        return sum;
//    }

}
