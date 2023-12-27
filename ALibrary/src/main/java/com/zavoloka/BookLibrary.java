package com.zavoloka;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
	public void sellBook(Book bookToSell, Client client) {
		if (allBooks.contains(bookToSell) && !bookToSell.isSold()) {
			// Assuming the Book class has a setSold method to mark it as sold
			bookToSell.setSold(true);
			allBooks.remove(bookToSell);
			client.buyBook(bookToSell);
			System.out.println("Book sold: " + bookToSell.getTitle());
		} else {
			System.out.println("Book not available for sale: " + bookToSell.getTitle());
		}
	}
	public List<Book> getAllBooks() {
		return allBooks;
	}
	public List<Book> getBorrowedBooks(){
		return borrowedBooks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(allBooks, borrowedBooks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;

		BookLibrary otherLibrary = (BookLibrary) obj;

		return Objects.equals(allBooks, otherLibrary.allBooks) &&
				Objects.equals(borrowedBooks, otherLibrary.borrowedBooks);
	}

	@Override
	public String toString() {
		return "BookLibrary{" +
				"allBooks=" + allBooks +
				", borrowedBooks=" + borrowedBooks +
				'}';
	}
}