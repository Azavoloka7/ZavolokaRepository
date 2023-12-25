package javaTreeSet;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Mango");
        treeSet.add("Mango");

        // Displaying the elements in natural order (ascending)
        System.out.println("TreeSet elements in natural order: " + treeSet);

        // Removing an element
      //  treeSet.remove("Banana");
    //    System.out.println("After removing 'Banana': " + treeSet);

      
   
        System.out.println("Does TreeSet contain 'Mango'? " + treeSet.contains("Mango"));

        
        System.out.println("Size of TreeSet: " + treeSet.size());
        System.out.println(treeSet);

        // Clearing all elements
       // treeSet.clear();
     //   System.out.println("TreeSet after clearing all elements: " + treeSet);
    }
}
