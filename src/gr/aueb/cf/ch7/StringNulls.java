package gr.aueb.cf.ch7;

/**
 * Null vs empty String.
 */
public class StringNulls {

    public static void main(String[] args) {
        String s1;              // s1 == null
        String s2 = null;       // s2 == null
        String s3 = "";         // empty String -> s3.length() == 0

       if (s3.isEmpty()) {  // if (s3.length() == 0
           System.out.println("is empty");
       } else {
           System.out.println("not empty");
       }
    }
}
