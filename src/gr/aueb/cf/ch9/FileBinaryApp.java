package gr.aueb.cf.ch9;

import java.io.*;
import java.time.LocalDateTime;

public class FileBinaryApp {

    public static void main(String[] args) {

    }

    public static void binaryInputReadWrite(String inputFile, String outputFile) throws IOException {

        final int BUFFER_SIZE = 4096;   // 4KB buffer
        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead;

        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }

    }

    public static void binaryBufferedInputReadWrite(String inputFile, String outputFile) throws IOException {

        final int BUFFER_SIZE = 8192;   // 8KB buffer
        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead;

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile), BUFFER_SIZE);
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFile), BUFFER_SIZE)) {

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }

    }
}
