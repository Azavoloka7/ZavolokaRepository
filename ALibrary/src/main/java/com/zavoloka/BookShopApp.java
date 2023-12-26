package com.zavoloka;

import java.util.Arrays;
import java.util.List;

public class BookShopApp {

	private double getCustomerBalance() {
		// Replace this with the actual logic to get the customer's balance
		return 100.0; // Example: assuming the initial balance is $100
	}

	// Placeholder method to deduct the book price from the customer's balance (replace with actual implementation)
	private void deductBalance(double amount) {
		// Replace this with the actual logic to deduct the balance
		// Example: deduct the amount from the customer's balance
	}

	// Placeholder method to update the inventory after selling a book (replace with actual implementation)
	private void updateInventory(Book book) {
		// Replace this with the actual logic to update the inventory
		// Example: decrement the quantity of the sold book in the inventory
	}


	private boolean customerHasEnoughBalance(Book book) {
		// Assuming the customer's balance is stored somewhere in your application
		// and there's a method to retrieve it, for example, customer.getBalance().
		// You would need to replace this with your actual implementation.
		double customerBalance = getCustomerBalance();

		// Compare the book price with the customer's balance
		return book.getPrice() <= customerBalance;
    }

	private void processSale(Book book) {

		double bookPrice = book.getPrice();
		deductBalance(bookPrice);
		updateInventory(book);
	}
	
	private static void displayAllBooks(BookLibrary library) {
		System.out.println("Books in the library:");
		for (Book book : library.getAllBooks()) {
			System.out.println(book);
		}
	}
	public static void main(String[] args) {
		// Створення об'єктів
		BookLibrary library = new BookLibrary();
		Manager manager = new Manager(9, 29, "Alexei","Nesterets", 2, 1 );
		Client client  = new Client(8, 34, "Volodymyr", "Potaichuk", "123 Main St", "0990999");
		Client client2  = new Client(10, 32, "Ihor", "Bezluda", "13 Ushakov St", "0127745");



		// Додавання книг до бібліотеки
		List<Book> books = Arrays.asList(
				new Book(11, "The Great Gatsby", "F. Scott Fitzgerald", 19.99,true),
				new Book(12, "To Kill a Mockingbird", "Harper Lee", 14.99, true),
				new Book(13,"1984", "George Orwell", 12.99, true),
				new Book(14,"Pride and Prejudice", "Jane Austen", 9.99, true),
				new Book(15,"The Catcher in the Rye", "J.D. Salinger", 15.99, true),
				new Book(16,"Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 24.99, true),
				new Book(17,"The Hobbit", "J.R.R. Tolkien", 18.99, true),
				new Book(18,"The Da Vinci Code", "Dan Brown", 20.99, true),
				new Book(19,"The Lord of the Rings", "J.R.R. Tolkien", 29.99, true),
				new Book(20,"The Shining", "Stephen King", 16.99, true),
				new Book(21,"Brave New World", "Aldous Huxley", 13.99, true),
				new Book(22,"The Chronicles of Narnia", "C.S. Lewis", 22.99, true),
				new Book(23,"The Grapes of Wrath", "John Steinbeck", 17.99, true),
				new Book(24,"The Road", "Cormac McCarthy", 14.99, true),
				new Book(25,"The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 11.99, true),
				new Book(26,"Moby-Dick", "Herman Melville", 21.99, true),
				new Book(27,"The War of the Worlds", "H.G. Wells", 10.99, true),
				new Book(28,"The Sun Also Rises", "Ernest Hemingway", 16.99, true),
				new Book(29,"One Hundred Years of Solitude", "Gabriel García Márquez", 19.99, true),
				new Book(30,"Alice's Adventures in Wonderland", "Lewis Carroll", 12.99, true)

		);

			for (Book book : books) {
			manager.addBook(library, book);
		}


System.out.println("***********************************************");

System.out.println(manager.toString());
System.out.println(client.toString());
System.out.println(client2.toString());


System.out.println("***********************************************");


client.borrowBook(library,library.getAllBooks().get(5));

client.returnBook(library,new Book(11, "The Great Gatsby", "F. Scott Fitzgerald", 19.99,true) );

		// Виведення всіх книг після взаємодії
	//	displayAllBooks(library);
		System.out.println("*********************");
		System.out.println("Borrowed books: "+library.borrowedBooks);



	}

	// Метод для виведення всіх книг в бібліотеці

}