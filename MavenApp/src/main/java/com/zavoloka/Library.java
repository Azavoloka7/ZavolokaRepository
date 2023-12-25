package com.zavoloka;

import java.util.ArrayList;
import java.util.List;

public class Library implements Cloneable{
    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Library{");
        stringBuilder.append("books=[");

        for (Book book : books) {
            stringBuilder.append(book).append(", ");
        }

        // Remove the trailing comma and space if there are books
        if (!books.isEmpty()) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }

        stringBuilder.append("]}");
        return stringBuilder.toString();
    }
    @Override
    public Library clone() {
        try {
            Library clone = (Library) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
