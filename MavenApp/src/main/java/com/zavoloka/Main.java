package com.zavoloka;

public class Main {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("Fandorin's adventures", "Boris Akunin");
        // Create a library
        Library library = new Library();

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display books in the library
        library.displayBooks();

        Library library2 = library.clone();
        System.out.println("\nCloned Library1  ");
        library2.displayBooks();




        System.out.println("\nbook1 hashCode="+book1.hashCode()+"\nbook2 hashCode="+book2.hashCode()+"\nbook3 hashCode="+book3.hashCode());

        System.out.println("\nlib1HashCode="+library.hashCode());
        System.out.println("\nlib2HashCode="+library2.hashCode());

        System.out.println(library2.toString());
    }
}