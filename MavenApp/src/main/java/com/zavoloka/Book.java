package com.zavoloka;

import java.util.Objects;

public class Book implements Cloneable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Book clonedBook = (Book) super.clone();
        // If String fields are mutable, create new instances
        clonedBook.title = new String(this.title);
        clonedBook.author = new String(this.author);
        return clonedBook;
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
    @Override
    public String toString()
    {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + '}';
    }
}
