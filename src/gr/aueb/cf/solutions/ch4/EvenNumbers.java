package gr.aueb.cf.solutions.ch4;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Οι άρτιοι από 1 έως 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

