package gr.aueb.cf.ch4;

/**
 * for runs forever, idiomatic case.
 */
public class ForeverApp {

    public static void main(String[] args) {
        int count = 0;

        for (;;) {
            System.out.print("forever");
            count++;
            if (count % 10 == 0) System.out.println();

        }
    }
}
