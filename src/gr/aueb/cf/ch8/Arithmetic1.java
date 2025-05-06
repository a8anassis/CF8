package gr.aueb.cf.ch8;

/**
 * Δημιουργεί ένα ArithmeticException
 * χωρίς να το χειρίζεται.
 */
public class Arithmetic1 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int result = 0;

        result = div(num1, num2);

        System.out.println("This line is not executed");
    }

    public static int div(int num1, int num2) {
        return num1 / num2;
    }

}
