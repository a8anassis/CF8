package gr.aueb.cf.ch9;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class NioReadAndWrite {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:/tmp/test.txt");
        textWriter(path);
    }

    public static void textWriter(Path path) throws IOException {
        Files.createDirectories(path.getParent());  // creates the directory if it doesn't exist
        Files.writeString(
                path,
                "Hello",
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );
    }

    /**
     * Closes automatically. No need for try-with-resources.
     * @param path
     * @throws IOException
     */
    public static void textReader(Path path) throws IOException {
        String text = Files.readString(path, StandardCharsets.UTF_8);
        System.out.println(text);
    }

    public static void textReaderByLine(Path path) throws IOException {
        try (var lines = Files.lines(path, StandardCharsets.UTF_8)) {
            lines.forEach(System.out::println);
        }
    }


    public static void binaryWriter(Path source, Path target) {
        try (var sourceStream = Files.newInputStream(source);
             var targetStream = Files.newOutputStream(target)) {
            sourceStream.transferTo(targetStream);  // efficient, streams in chunks
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void textFlatMap(Path path) {
        try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
            lines.flatMap(line -> Stream.of(line.split(" ")))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
