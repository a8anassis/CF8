package gr.aueb.cf.ch7;

/**
 * Βρίσκει τη θέση μέσα σε ένα String
 * ενός χαρακτήρα ή και substring.
 */
public class StringIndexOf {

    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o");              // 1
        System.out.println(positionOfo);

        int positionOfNexto = cf.indexOf("o", 2);       // 11
        System.out.println(positionOfNexto);

        int positionOfLasto = cf.lastIndexOf("o");      //11
        System.out.println(positionOfLasto);
    }
}
