package gr.aueb.cf.ch18.streams;

import java.util.List;

public class MatchMain {

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Costas", "Denis");

        boolean isDenisExists = names.stream()
                .anyMatch(name -> name.equals("Denis"));

        boolean allAreDenis = names.stream()
                .allMatch(name -> name.equals("Denis"));

        boolean noneIsDenis = names.stream()
                .noneMatch(name -> name.equals("Denis"));
    }
}
