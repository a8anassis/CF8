package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileWritersApp {

    public static void main(String[] args) {
        File fd = new File("C:/tmp/file-writer.txt");
        try {
            fileWriter(fd);
        } catch (IOException e) {
            System.out.println("Το αρχείο δεν δημιουργήθηκε ή κάποιο λάθος συνέβη.");
        }
    }


    public static void fileWriter(File file) throws IOException {
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("Coding!");
            fw.flush();
        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }
}
