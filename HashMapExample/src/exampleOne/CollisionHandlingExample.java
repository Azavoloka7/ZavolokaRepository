package exampleOne;

import java.util.*;

public class CollisionHandlingExample {
    public static void main(String[] args) {
        // Create a HashMap with a small size to intentionally cause collisions
        HashMap<Integer, String> hashMap = new HashMap<>(5);

        // Adding key-value pairs
        hashMap.put(1, "Alice");
        hashMap.put(2, "Alla");
        hashMap.put(3, "Frankie");
        hashMap.put(4, "Jason");
        hashMap.put(5, "Amanda");
        hashMap.put(6, "Bob");   // Causes a collision with index 1

        // Retrieving values
        String alice = hashMap.get(1);
        String bob = hashMap.get(6);

        System.out.println("hashMap.HashCode()="+hashMap.hashCode());

        int hashSumFinal=0;

        for (int i=1; i<= hashMap.size();i++)
        {
            System.out.print(hashMap.get( i ).hashCode()+" ");
            hashSumFinal+=hashMap.get( i ).hashCode();
        }
        System.out.println("\n");
        System.out.println(hashSumFinal);
    }
}
