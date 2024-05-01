package com.example.demo.PMS.Models;

import com.example.demo.BMS.Models.Book;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private long id;
    private String name;
    private String email;
    private List<Book> borrowedBooks;

    public Patron(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        borrowedBooks = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(Book book) {
        this.borrowedBooks.add(book);
    }
}
