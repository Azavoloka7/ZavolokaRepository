package com.zavoloka;

import java.util.Arrays;
import java.util.List;

public class ALibrary {

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
		Client client  = new Client(8,100.00, 34, "Volodymyr", "Potaichuk", "123 Main St", "0990999");
		Client client2  = new Client(10,15.50, 32, "Ihor", "Bezluda", "13 Ushakov St", "0127745");



		// Додавання книг до бібліотеки
		List<Book> books = Arrays.asList(
				new Book(11, "The Great Gatsby", "F. Scott Fitzgerald", 19.99, false),
				new Book(12, "To Kill a Mockingbird", "Harper Lee", 14.99,false),
				new Book(13,"1984", "George Orwell", 12.99, false),
				new Book(14,"Pride and Prejudice", "Jane Austen", 9.99, false),
				new Book(15,"The Catcher in the Rye", "J.D. Salinger", 15.99, false),
				new Book(16,"Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 24.99, false),
				new Book(17,"The Hobbit", "J.R.R. Tolkien", 18.99,false),
				new Book(18,"The Da Vinci Code", "Dan Brown", 20.99,false),
				new Book(19,"The Lord of the Rings", "J.R.R. Tolkien", 29.99,false),
				new Book(20,"The Shining", "Stephen King", 16.99,false),
				new Book(21,"Brave New World", "Aldous Huxley", 13.99,false),
				new Book(22,"The Chronicles of Narnia", "C.S. Lewis", 22.99,false),
				new Book(23,"The Grapes of Wrath", "John Steinbeck", 17.99,false),
				new Book(24,"The Road", "Cormac McCarthy", 14.99,false),
				new Book(25,"The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 11.99,false),
				new Book(26,"Moby-Dick", "Herman Melville", 21.99,false),
				new Book(27,"The War of the Worlds", "H.G. Wells", 10.99,false),
				new Book(28,"The Sun Also Rises", "Ernest Hemingway", 16.99,false),
				new Book(29,"One Hundred Years of Solitude", "Gabriel García Márquez", 19.99,false),
				new Book(30,"Alice's Adventures in Wonderland", "Lewis Carroll", 12.99,false)

		);

		for (Book book : books) {
			manager.addBook(library, book);
		}


		System.out.println("***********************************************");

		System.out.println(manager.toString());
		System.out.println(client.toString());
		System.out.println(client2.toString());


		System.out.println("***********************************************");


		client.borrowBook(library,library.getAllBooks().get(1));

		System.out.println(client);
		client.returnBook(library, new Book(12, "To Kill a Mockingbird", "Harper Lee", 14.99,false));

	library.sellBook(library.getAllBooks().get(1), client );
	//	client2.borrowBook(library,new Book(16,"Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 24.99, true) );

	//	client2.returnBook(library,new Book(16,"Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 24.99, false));

		// Виведення всіх книг після взаємодії
			displayAllBooks(library);

		System.out.println("*********************");

		System.out.println("Borrowed books: \n"+library.getBorrowedBooks());

		System.out.println(client.getBalance());
		client.buyBook(library.getAllBooks().get(1));
		System.out.println(client.getBalance());

		System.out.println(books);


	}

	// Метод для виведення всіх книг в бібліотеці

}