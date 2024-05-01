package com.example.demo.BMS.Models;

import com.example.demo.BMS.Models.Book;

import java.util.List;

public class Genre {
    private String genreName;
    private List<Book> books;

    public Genre(String genreName) {
        this.genreName = genreName;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
