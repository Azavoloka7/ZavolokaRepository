package collectiosJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionExample {
    private List<String> namesList;
    private Map<Integer, String> idToNameMap;

    public CollectionExample() {
        namesList = new ArrayList<>();
        idToNameMap = new HashMap<>();
    }

    public void addName(String name) {
        namesList.add(name);
    }

    public void addIdAndName(int id, String name) {
        idToNameMap.put(id, name);
    }

    public void displayNames() {
        System.out.println("Names List:");
        for (String name : namesList) {
            System.out.println(name);
        }
    }

    public void displayIdAndNames() {
        System.out.println("\nId to Name Map:");
        for (Map.Entry<Integer, String> entry : idToNameMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        CollectionExample collectionExample = new CollectionExample();

        // Adding names to the list
        collectionExample.addName("Alice");
        collectionExample.addName("Bob");
        collectionExample.addName("Charlie");

        // Adding ID and names to the map
        collectionExample.addIdAndName(1, "John");
        collectionExample.addIdAndName(2, "Eva");
        collectionExample.addIdAndName(3, "Michael");
      

        // Displaying names from the list
        collectionExample.displayNames();

        // Displaying ID and names from the map
        collectionExample.displayIdAndNames();
    }
}
