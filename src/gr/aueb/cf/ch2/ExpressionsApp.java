package gr.aueb.cf.ch2;

/**
 * Demo για παραστάσεις ακεραίων με τη χρήση
 * αριθμητικών τελεστές.
 */
public class ExpressionsApp {

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 10;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0;
        int result2 = 0;

        sum = num1 + num2;  // 35
        sub = num1 - num2;  // 15
        mul = num1 * num2;  // 250
        div = num1 / num2;  // 2 , Το αποτέλεσμα της διαίρεσης ακεραίων είναι πάντα ακέραιος
        mod = num1 % num2;  // 5

        System.out.printf("sum: %d, sub: %d, mul: %d, div: %d, mod: %d\n", sum, sub, mul, div, mod);

        result1 = result1 + 1;  // 1
        result2 = result2 + 5;  // 5

        System.out.printf("Result1: %d, Result2: %d", result1, result2);

        result1 += 12;  // result1 = result1 + 12
        result2 *= 3;   // result2 = result2 * 3

        System.out.printf("Result1: %d, Result2: %d", result1, result2);









    }
}
