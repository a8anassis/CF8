package gr.aueb.cf.ch17.builder_pattern;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book.Builder(1, "12890")
                .author("Athanassios")
                .title("Java Intro")
                .build();
    }
}
