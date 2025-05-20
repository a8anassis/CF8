package gr.aueb.cf.ch10_challenges;

public class FindCharsInAString {

    public static void main(String[] args) {

    }

    /**
     * Δοσμένου ενός string s, ενός χαρακτήρα ch και ενός αριθμού n
     * βρίσκει το πλήθος των φορών που εμφανίζεται ο χαρακτήρας ch,
     * στους πρώτους n χαρακτήρες του string s.
     *
     * @param s     το String εισόδου.
     * @param ch    ο χαρακτήρας εισόδου.
     * @param n     τα πρώτα n ψηφία.
     * @return      το πλήθος των φορών που εμφανίζεται ο χαρακτήρας ch,
     *              τους πρώτους n χαρακτήρες του string s.
     */
    public static int getCount(String s, char ch, int n) {
        int count = 0;

        if (n > s.length()) return 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ch) count++;
        }
        return count;
    }
}
