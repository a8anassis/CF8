package gr.aueb.cf.ch5;

/**
 * Demo of method overloading.
 */
public class MethodOverloading {

    public static void main(String[] args) {
        int sum2, sum1, sum3;

        sum1 = add(5, 3);
        sum2 = add(1, 7, 8);
        sum3 = add(1L, 15L);

        System.out.printf("%d \t%d \t%d", sum1, sum2, sum3);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Overloaded version of add.
     * method name + formal params = method signature
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(long a, long b) {
        return (int) (a + b);
    }
}
