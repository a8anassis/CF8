package gr.aueb.cf.ch4;

/**
 * Εκτυπώσει 10 γραμμές με αστεράκια
 * όπου στη 1η σειρά 10 αστεράκια, στη
 * 2η σειρά 9 αστεράκια, κλπ μέχρι
 * τη 1η σειρά με 1 αστεράκι.
 */
public class StarsDesc10 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
