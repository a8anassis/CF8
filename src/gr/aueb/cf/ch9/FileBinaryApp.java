package gr.aueb.cf.ch9;

import java.io.*;
import java.time.LocalDateTime;
import java.util.UUID;

public class FileBinaryApp {

    public static void main(String[] args) {
        String inputFile = "C:/tmp/dummy.pdf";
        String outputFile = "C:/tmp/dummy-out.pdf";

        try {
            binaryInputReadWrite(inputFile, outputFile);
        } catch (IOException e) {
            System.err.println("Η αντιγραφή του αρχείου απέτυχε.");
        }
    }

    public static void binaryInputReadWrite(String inputFile, String outputFile) throws IOException {
        final int BUFFER_SIZE = 8192;   // 8KB buffer
        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead;
        long start;
        long end;
        double elapsedTime;
        int counter = 0;

        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            start = System.currentTimeMillis();
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                counter += bytesRead;
            }
            end = System.currentTimeMillis();
            elapsedTime = (end - start) / 1000.0;
            System.out.printf("Το αρχείο με μέγεθος %.2f (%d bytes) αντιγράφηκε επιτυχώς\n", (counter / 1024.0), counter);
            System.out.println("Elapsed Time: " + elapsedTime + " seconds");

            File inFd = new File(inputFile);
            File outFd = new File(outputFile);
            System.out.println("Input File Absolute Path: " + inFd.getAbsolutePath());
            System.out.println("Output File Absolute Path: " + outFd.getAbsolutePath());

            // Hint for random output paths
//            String outputRandomPath = outputFile + UUID.randomUUID().toString().replaceAll("-", "");
//            File randomFile = new File(outputRandomPath);
//            FileOutputStream bos2 = new FileOutputStream(randomFile);

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
