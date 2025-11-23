package gr.aueb.cf.solutions.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.util.UUID;

public class CopyAttachedWithMetadataNIO {

    public static void main(String[] args) {
        String inputPath = "C:/tmp/";
        String outPath = "C:/tmp/";
        Scanner in = new Scanner(System.in);

        System.out.println("Insert input file name:");
        String userInputFile = in.nextLine();

        Path inputFile = Path.of(inputPath, userInputFile);

        // Extract file extension
        String extension = "";
        String fileName = inputFile.getFileName().toString();
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
            extension = fileName.substring(dotIndex);
        }

        // Generate output file path with UUID
        String outFileName = UUID.randomUUID().toString().replace("-", "") + extension;
        Path outFile = Path.of(outPath, outFileName);

        try {
            // Ensure parent directories exist
            if (outFile.getParent() != null) {
                Files.createDirectories(outFile.getParent());
            }

            // Copy file using NIO (streaming copy)
            Files.copy(inputFile, outFile, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Input file: " + inputFile.toAbsolutePath());
            System.out.println("Output file: " + outFile.toAbsolutePath());
            System.out.println("Extension alone: " + extension);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

