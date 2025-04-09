package gr.aueb.cf.ch3;

/**
 * Υπολογίζει το άθροισμα των 10 πρώτων
 * ακεραίων, από το 1 έως το 10.
 */
public class SumMul10 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        int mul = 1;
        int j = 1;

        while (i <= 10) {
            sum = sum + i;  // sum += i;
            i++;
        }

        while (j <= 10) {
            mul = mul * j;  // mul *= j;
            j++;
        }

        System.out.printf("Άθροισμα=%d, Γινόμενο=%,d", sum, mul);
    }
}
