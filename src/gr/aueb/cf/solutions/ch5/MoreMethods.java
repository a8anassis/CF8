package gr.aueb.cf.solutions.ch5;

public class MoreMethods {

    public static void main(String[] args) {

        // fahrenheit
        double input = 0;
        double expected = 32;
        double actual = celsiusToFahrenheit(input);

        System.out.println("Expected: " + expected + ", Actual: " + actual);
        System.out.println(actual == expected ? "Test passed" : "Test failed");

        // math utils
        int inputMathUtils = 5;
        int expectedMathUtils = 25;
        int actualMathUtils = square(inputMathUtils);

        System.out.println("Expected: " + expectedMathUtils + ", Actual: " + actualMathUtils);
        System.out.println(actualMathUtils == expectedMathUtils ? "Test passed" : "Test failed");

        // is prime
        int inputIsPrime = 7;
        boolean expectedIsPrime = true;
        boolean actualIsPrime = isPrime(inputIsPrime);

        System.out.println("Expected: " + expectedIsPrime + ", Actual: " + actualIsPrime);
        System.out.println(actualIsPrime == expectedIsPrime ? "Test passed" : "Test failed");

        // Max Finder
        int a = 10, b = 25, c = 17;
        int expectedMax = 25;
        int actualMax = findMax(a, b, c);

        System.out.println("Expected: " + expectedMax + ", Actual: " + actualMax);
        System.out.println(actualMax == expectedMax ? "Test passed" : "Test failed");
    }


    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static int square(int number) {
        return number * number;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
