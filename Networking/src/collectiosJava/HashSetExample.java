package collectiosJava;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet of strings
        HashSet<String> myHashSet = new HashSet<>();

        // Adding elements to the HashSet
        myHashSet.add("Apple");
        myHashSet.add("Banana");
        myHashSet.add("Orange");
        myHashSet.add("lemon");

        // Displaying the elements of the HashSet
        System.out.println("HashSet elements: " + myHashSet);

        // Adding a duplicate element (won't be added)
        myHashSet.add("Apple");

        // Displaying the elements after attempting to add a duplicate
        System.out.println("HashSet elements after adding a duplicate: " + myHashSet);

        // Removing an element from the HashSet
        myHashSet.remove("Banana");

        // Displaying the elements after removing an element
        System.out.println("HashSet elements after removing 'Banana': " + myHashSet);

        // Checking if an element is present in the HashSet
        boolean containsOrange = myHashSet.contains("Orange");
        System.out.println("Is 'Orange' present in the HashSet? " + containsOrange);

        // Checking the size of the HashSet
        System.out.println("Size of HashSet: " + myHashSet.size());

        // Clearing all elements from the HashSet
        myHashSet.clear();

        // Displaying the elements after clearing the HashSet
        System.out.println("HashSet elements after clearing: " + myHashSet);
    }
}
