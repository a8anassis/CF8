package gr.aueb.cf.ch10_challenges;

public class FrogSpider {

    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 3},
                {7, 3, 2},
                {2, 4, 3},
                {1, 2, 1},
                {14, 12, 10}
        };

        for (int i = 0; i < grid.length; i++) {
            printWhichFrogEatsSpider(grid[i][0], grid[i][1], grid[i][2]);
        }
    }

    /**
     * Prints 'Βάτραχος 1' αν η απόσταση του Βατράχου 1 από την
     * Αράχνη είναι μικρότερη από την απόσταση του Βατράχου 2 από
     * την αράχνη, αλλιώς αν η απόσταση του Βατράχου 2 από την
     * Αράχνη είναι μικρότερη από την απόσταση του Βατράχου 1
     * εκτυπώνει 'Βάτραχος 2'. Αλλιώς εκτυπώνει 'Αράχνη' αν οι
     * αποστάσεις είναι ίδιες.
     *
     * @param frog1     η θέση του Βατράχου 1.
     * @param frog2     η θέση του Βατράχου 2.
     * @param spider    η θέση της Αράχνης.
     */
    public static void printWhichFrogEatsSpider(int frog1, int frog2, int spider) {
        int distance1;
        int distance2;

        distance1 = Math.abs(frog1 - spider);
        distance2 = Math.abs(frog2 - spider);

        if (distance1 < distance2) {
            System.out.println("Βάτραχος 1");
        } else if (distance2 < distance1) {
            System.out.println("Βάτραχος 2");
        } else {    // distance1 == distance2
            System.out.println("Αράχνη");
        }
    }
}
