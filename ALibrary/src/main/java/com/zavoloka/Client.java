package com.zavoloka;



import java.util.Objects;

public class Client {
	private int id;
	private int age;
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private int borrowedBooks;
	private double balance;

	// Default constructor
	public Client() {
	}


	private void processPurchase(Book book) {
	}

	// Parameterized constructor
	public Client(int id, double balance, int age, String firstName, String lastName, String address, String phoneNumber) {
		this.id = id;
		this.balance = balance;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	// Getter and setter methods for each field

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// toString method for better string representation

	@Override
	public String toString() {
		return "Client{" +
				"id=" + id +
				", age=" + age +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", address='" + address + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				'}';
	}

	// hashCode and equals methods for proper comparison and hashing
	@Override
	public int hashCode() {
		return Objects.hash(id, age, firstName, lastName, address, phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Client client = (Client) obj;
		return id == client.id &&
				age == client.age &&
				Objects.equals(firstName, client.firstName) &&
				Objects.equals(lastName, client.lastName) &&
				Objects.equals(address, client.address) &&
				Objects.equals(phoneNumber, client.phoneNumber);
	}

	public void borrowBook(BookLibrary library, Book bookToBorrow) {
		boolean success = library.borrowBook(bookToBorrow, this);

		if (success) {
			System.out.println("Book borrowed: " + bookToBorrow.getTitle());
		} else {
			System.out.println("Book not available for borrowing: " + bookToBorrow.getTitle());
		}
	}

	public void returnBook(BookLibrary library, Book bookToReturn) {
		library.addBook(bookToReturn);

		System.out.println("Book returned: " + bookToReturn.getTitle());
	}

	public void addBorrowedBook(Book bookToBorrow) {

		System.out.println("Book added to borrowed books: " + bookToBorrow.getTitle());

	}
	private void updateInventory(Book book) {
		// Replace this with the actual logic to update the inventory
		// Example: decrement the quantity of the sold book in the inventory

	}
	public static void main(String[] args) {
		// Creating a BookLibrary instance (assuming you have a BookLibrary class)
		BookLibrary library = new BookLibrary();

		// Creating a Client instance
		Client client3 = new Client(4, 50.00,33, "Max", "Murahovskii", "123 Centralna St", "555-1234");

		// Creating a Book instance (assuming you have a Book class)
		Book bookToBorrow = new Book(25,"The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 11.99, false);

		// Demonstrating borrowing and returning books
		client3.borrowBook(library, bookToBorrow);

		client3.returnBook(library, bookToBorrow);


		// Adding a borrowed book (assuming you have an addBorrowedBook method)
	//	client.addBorrowedBook(bookToBorrow);
		System.out.println(client3);
	}

	public void buyBook(Book bookToSell) {
		// Assuming the Book class has a getPrice method to get the book price
		double bookPrice = bookToSell.getPrice();

		// Check if the client has enough balance to buy the book
		if (balance >= bookPrice) {
			// Process the purchase
			processPurchase(bookToSell);

			// Update client's balance
			balance -= bookPrice;

			// Display a success message
			System.out.println("Book purchased: " + bookToSell.getTitle());
		} else {
			// Display an insufficient balance message
			System.out.println("Insufficient balance to buy the book: " + bookToSell.getTitle());
		}
	}

}
