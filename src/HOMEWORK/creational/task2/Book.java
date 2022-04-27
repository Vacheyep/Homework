package HOMEWORK.creational.task2;

import java.util.Date;

public class Book {
    private final String code;
    private final String title;
    private final String genre;
    private final String author;
    private final Date year;
    private final String description;



    public Book(String code, String title, String genre, String author, Date year, String description) {
        this.code = code;
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.year = year;
        this.description = description;

    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public Date getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }
}
