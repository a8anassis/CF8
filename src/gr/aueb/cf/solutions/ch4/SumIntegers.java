package gr.aueb.cf.solutions.ch4;

public class SumIntegers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += i;
        }
        System.out.println("Το άθροισμα των ακεραίων από 1 έως 50 είναι: " + sum);
    }
}
