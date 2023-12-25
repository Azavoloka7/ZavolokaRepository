package collectiosJava;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Creating a LinkedHashSet of integers
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(-30);
        linkedHashSet.add(0);
        linkedHashSet.add(30);
        // Displaying the elements of the LinkedHashSet
        System.out.println("LinkedHashSet elements: " + linkedHashSet);

        // Adding a duplicate element (won't be added)
        linkedHashSet.add(10);

        // Displaying the elements after attempting to add a duplicate
        System.out.println("LinkedHashSet elements after adding a duplicate: " + linkedHashSet);

        // Removing an element from the LinkedHashSet
        linkedHashSet.remove(20);

        // Displaying the elements after removing an element
        System.out.println("LinkedHashSet elements after removing '20': " + linkedHashSet);

        // Checking if an element is present in the LinkedHashSet
        boolean contains30 = linkedHashSet.contains(30);
        System.out.println("Is '30' present in the LinkedHashSet? " + contains30);

        // Checking the size of the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

        // Clearing all elements from the LinkedHashSet
        linkedHashSet.clear();

        // Displaying the elements after clearing the LinkedHashSet
        System.out.println("LinkedHashSet elements after clearing: " + linkedHashSet);
    }
}
