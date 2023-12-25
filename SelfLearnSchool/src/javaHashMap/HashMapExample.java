package javaHashMap;
import java.util.HashMap;
import java.util.Map;
public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap with Person objects
        Map<Person, String> personMap = new HashMap<>();

        // Adding persons to the map
        Person person1 = new Person("Alex", 38);
        Person person2 = new Person("Jane", 30);
        Person person3 = new Person("Dick", 33);
        Person person4 = new Person("Anatolii", 33);
        Person person5 = new Person("Diana", 25);
        Person person6 = new Person("Victoria", 23);
        personMap.put(person1, "Employee");
        personMap.put(person2, "Employee");
        personMap.put(null, "Manager");
        personMap.put(person3, "Employee");
        personMap.put(person4, "Director");
        personMap.put(person5, "Manager");
        personMap.put(person6, null);
        personMap.put(null, "Employee");
        
        // Displaying the contents of the map
        for (Map.Entry<Person, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Retrieving information using a Person object
        Person searchPerson = new Person("John", 25);
        String position = personMap.get(searchPerson);
        System.out.println("Position for " + searchPerson + ": " + position);
        
        
        System.out.println(personMap.size());
        
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
        System.out.println(person4.hashCode());
        System.out.println(personMap.hashCode());
        
        System.out.println(personMap.containsKey(person5));
        System.out.println(personMap.containsValue("Director"));
        
        for (Person person : personMap.keySet())
        {
        	System.out.println("(Key)Person: "+person+" Value: "+personMap.get(person));
        }
    }
}