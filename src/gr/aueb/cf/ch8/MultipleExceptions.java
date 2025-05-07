package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptions {

    public static void main(String[] args) {
        String numStr = "";
//        Scanner scanner = null;

        // try-with-resources
        try (Scanner scanner = new Scanner(new File("text.txt"))) {
            while (!isInteger(numStr = scanner.nextLine())) {
                System.out.println("Παρακαλώ εισάγετε νέο ακέραιο");
            }
            System.out.println(numStr);
        } catch (FileNotFoundException | InputMismatchException e) {
            System.out.println(LocalDateTime.now() + "Γενικό IO error\n" + e);
        } catch (IOException e) {
            System.out.println("Το αρχείο δεν βρέθηκε" + e);
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    public static boolean isInteger(String s) {
        return s.matches("-?\\d+");
    }
}
