package gr.aueb.cf.ch17.builder_pattern;

public class Book {
    private final long id;
    private final String isbn;
    private final String author;
    private final String title;

    private Book(Builder builder) {
        this.id = builder.id;
        this.isbn = builder.isbn;
        this.author = builder.author;
        this.title = builder.title;
    }

    public static class Builder {
        private final long id;
        private final String isbn;
        private String author   = "";
        private String title    = "";

        public Builder(long id, String isbn) {
            this.id = id;
            this.isbn = isbn;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    public long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
