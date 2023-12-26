package com.zavoloka;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
	private final List<Book> allBooks;
	public List<Book> borrowedBooks;


	public BookLibrary() {
		allBooks = new ArrayList<>();
		borrowedBooks = new ArrayList<>();
	}

	public void addBook(Book book) {
		allBooks.add(book);
	}

	public void returnBook(Book bookToReturn) {
		if (borrowedBooks.contains(bookToReturn)) {
			borrowedBooks.remove(bookToReturn);
			allBooks.add(bookToReturn);
			System.out.println("Book returned: " + bookToReturn.getTitle());
		} else {
			System.out.println("This book was not borrowed from this library: " + bookToReturn.getTitle());
		}
	}

	public boolean borrowBook(Book bookToBorrow, Client client) {
		if (allBooks.contains(bookToBorrow)) {
			allBooks.remove(bookToBorrow);
			borrowedBooks.add(bookToBorrow);
			client.addBorrowedBook(bookToBorrow);
			System.out.println("Book borrowed: " + bookToBorrow.getTitle());
			return true;
		} else {
			System.out.println("Book not available for borrowing: " + bookToBorrow.getTitle());
			return false;
		}
	}

	public List<Book> getAllBooks() {
		return allBooks;
	}
	public List<Book> getBorrowedBooks(){
		return borrowedBooks;
	}
}