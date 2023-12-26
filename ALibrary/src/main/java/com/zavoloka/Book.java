package com.zavoloka;

public class Book {
	private int id;
	private String title;
	private String author;
	private double price;
	private boolean inStuck;

	// Default constructor
	public Book() {
	}

	// Parameterized constructor
	public Book(int id, String title, String author, double price, boolean inStock) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.inStuck = true;
	}
	public int getId() {
		return id;
	}

	// Setter for title
	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Book{" +  " id= "+id+
				" title='" + title + '\'' +
				", author='" + author + '\'' +
				", price=" + price + " inStuck= "+inStuck+
				'}';
	}

	public boolean isInStuck() {
		return inStuck;
	}


}

