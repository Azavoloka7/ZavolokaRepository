package com.zavoloka;

import java.util.Objects;

public class Manager {
	private int id;

	private int age;
	private String firstName;
	private String lastName;


	private int sales;
	private int experience;

	// Default constructor
	public Manager() {
	}

	// Parameterized constructor
	public Manager(int id,int age, String firstName, String lastName, int sales, int experience) {
		this.id = id;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sales = sales;
		this.experience = experience;
	}

	// Getter and setter methods for each field
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	// You can also override toString() method for better string representation

	@Override
	public int hashCode() {
		return Objects.hash(id, age, firstName, lastName, sales, experience);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;

		Manager otherManager = (Manager) obj;

		return id == otherManager.id &&
				age == otherManager.age &&
				sales == otherManager.sales &&
				experience == otherManager.experience &&
				Objects.equals(firstName, otherManager.firstName) &&
				Objects.equals(lastName, otherManager.lastName);
	}

	@Override
	public String toString() {
		return "Manager{" +
				"id=" + id + " age=" + age +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", sales=" + sales +
				", experience=" + experience +
				'}';
	}

	public void addBook(BookLibrary library, Book book) {
		library.addBook(book);
		System.out.println("Book added: " + book.getTitle());
	}
}
