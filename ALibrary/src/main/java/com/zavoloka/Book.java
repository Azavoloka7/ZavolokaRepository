package com.zavoloka;

import java.util.Objects;

public class Book {
	private int id;
	private String title;
	private String author;
	private double price;
	private boolean sold;

	// Default constructor
	public Book() {
	}

	// Parameterized constructor
	public Book(int id, String title, String author, double price, boolean sold) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.sold = sold;

	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, title, author, price, sold);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;

		Book otherBook = (Book) obj;

		return id == otherBook.id &&
				Double.compare(otherBook.price, price) == 0 &&
				sold == otherBook.sold &&
				Objects.equals(title, otherBook.title) &&
				Objects.equals(author, otherBook.author);
	}

	@Override
	public String toString() {
		return "Book{" +
				"id=" + id +
				", title='" + title + '\'' +
				", author='" + author + '\'' +
				", price=" + price +
				", sold=" + sold +
				'}';
	}

	// Getter for title
	public String getTitle() {
		return title;
	}

	// Setter for title
	public void setTitle(String title) {
		this.title = title;
	}

	// Getter for author
	public String getAuthor() {
		return author;
	}

	// Setter for author
	public void setAuthor(String author) {
		this.author = author;
	}

	// Getter for price
	public double getPrice() {
		return price;
	}

	// Setter for price
	public void setPrice(double price) {
		this.price = price;
	}




	public void setSold(boolean sold) {
		this.sold = sold;
	}
	public boolean isSold() {
		return sold;
	}
}

