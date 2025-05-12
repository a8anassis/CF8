package gr.aueb.cf.ch9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileWritersApp {

    public static void main(String[] args) {
        File fd = new File("C:/tmp/file-writer3.txt");
        try {
//            fileWriter(fd);
            bufferedWriter(fd);
        } catch (IOException e) {
            System.out.println("Το αρχείο δεν δημιουργήθηκε ή κάποιο λάθος συνέβη.");
        }
    }

    public static void fileWriter(File file) throws IOException {
        try (FileWriter fw = new FileWriter(file, true)) {      // true is append
            fw.write("Coding!");
            fw.flush();
        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
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
}
