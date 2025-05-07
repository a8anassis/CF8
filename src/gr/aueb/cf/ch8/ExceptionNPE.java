package gr.aueb.cf.ch8;

public class ExceptionNPE {

    public static void main(String[] args) {

        String s = getOneOrNull();

        // Avoid NPE
        if (s == null) {
            System.out.println("String is null");
            System.exit(1);
        }

        System.out.println(s);
    }

    public static String getOneOrNull() {
        return null;
    }
}
