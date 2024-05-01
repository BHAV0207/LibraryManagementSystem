package com.example.demo.Models;

import java.util.Date;

import static com.example.demo.Models.BookStatus.NOT_ISSUED;

public class Book {
    private Author author;
    private Genre genre;
    private int id;
    private String title;
    private BookStatus bookStatus;

    private Date publicationDate;

    public Book(Author author, Genre genre, int id, String title) {
        this.author = author;
        this.genre = genre;
        this.id = id;
        this.title = title;
        bookStatus = NOT_ISSUED;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }
}
