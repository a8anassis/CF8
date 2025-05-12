package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public class FileWritersApp {

    public static void main(String[] args) {
        File fd = new File("C:/tmp/file-writer3.txt");
        try {
            fileWriter("C:/tmp/file-writer3.txt");
            bufferedWriter(fd);
        } catch (IOException e) {
            System.out.println("Το αρχείο δεν δημιουργήθηκε ή κάποιο λάθος συνέβη.");
        }
    }

    public static void fileWriter(String file) throws IOException {
        try (FileWriter fw = new FileWriter(file, true)) {      // true is append
            fw.write("Coding!");
            fw.flush();
        }
        catch (IOException e) {
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    public static void bufferedWriter(File file) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write("Coding!");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    public static void printStream(String file) throws IOException {
//        try (PrintStream ps = new PrintStream(file, StandardCharsets.UTF_8)) {
        try (PrintStream ps = new PrintStream(new FileOutputStream(file, true), false, StandardCharsets.UTF_8)) {   // true is append
           ps.println("Printing with print stream");
           ps.flush();
        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }
}
