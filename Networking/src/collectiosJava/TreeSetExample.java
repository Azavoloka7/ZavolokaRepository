package collectiosJava;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet of strings
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        

        // Displaying the elements of the TreeSet (naturally ordered)
        System.out.println("TreeSet elements: " + treeSet);

        // Adding a duplicate element (won't be added)
        treeSet.add("Apple");

        // Displaying the elements after attempting to add a duplicate
        System.out.println("TreeSet elements after adding a duplicate: " + treeSet);

        // Removing an element from the TreeSet
        treeSet.remove("Banana");

        // Displaying the elements after removing an element
        System.out.println("TreeSet elements after removing 'Banana': " + treeSet);

        // Checking if an element is present in the TreeSet
        boolean containsOrange = treeSet.contains("Orange");
        System.out.println("Is 'Orange' present in the TreeSet? " + containsOrange);

        // Checking the size of the TreeSet
        System.out.println("Size of TreeSet: " + treeSet.size());

        // Clearing all elements from the TreeSet
        treeSet.clear();

        // Displaying the elements after clearing the TreeSet
        System.out.println("TreeSet elements after clearing: " + treeSet);
    }
}
