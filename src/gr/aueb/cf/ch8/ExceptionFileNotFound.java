package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ExceptionFileNotFound {

    public static void main(String[] args) {
        String numStr = "";
//        Scanner scanner = null;

        // try-with-resources
        try (Scanner scanner = new Scanner(new File("text.txt"))) {
            while (!isInteger(numStr = scanner.nextLine())) {
                System.out.println("Παρακαλώ εισάγετε νέο ακέραιο");
            }
            System.out.println(numStr);
        } catch (FileNotFoundException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
        }

//        finally {
//            try {
//                if (scanner != null) scanner.close();
//            } catch (Exception e) {
//                System.out.println(LocalDateTime.now() + "\n" + e);
//            }
//        }
    }

    public static boolean isInteger(String s) {
        return s.matches("-?\\d+");
    }
}
