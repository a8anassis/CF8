package gr.aueb.cf.solutions.ch4;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        char operation;
        double result;

        System.out.print("Εισάγετε τον 1ο ακέραιο: ");
        num1 = scanner.nextInt();

        System.out.print("Εισάγετε τον 2ο ακέραιο: ");
        num2 = scanner.nextInt();

        System.out.print("Εισάγετε πράξη (+, -, *, /): ");
        operation = scanner.next().charAt(0);

        result = switch (operation) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    yield 0;
                }
                yield (double) num1 / num2;
            }
            default -> {
                System.out.println("Invalid operator.");
                yield 0;
            }
        };

        System.out.println("Result: " + result);
    }
}
