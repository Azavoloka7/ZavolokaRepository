package exampleTwo;
import java.util.HashMap;

public class HashMapExample implements Cloneable {


    private static CustomKey key7;
    private static String key6;

    public static void main(String[] args) {
        // Creating a HashMap with CustomKey as keys
        HashMap<CustomKey, String> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        CustomKey key1 = new CustomKey("developer");
        CustomKey key2 = new CustomKey("trader");
        CustomKey key5 = new CustomKey("import");
        CustomKey key7 = new CustomKey("IT");
        CustomKey key9 = new CustomKey( "tourism" );
        CustomKey key10 = key1.clone();


        hashMap.put(key1, "Vlad");
        hashMap.put(key2, "Valera");
        hashMap.put( key5, "Artem");
        hashMap.put( key7, "Anatolii");
        hashMap.put( key9, "Vitalik" );
        // Retrieving values using keys
        System.out.println(hashMap.get(new CustomKey("developer"))); // Output: Vlad
        System.out.println(hashMap.get(new CustomKey("import"))); // Output: Artem

        System.out.println(hashMap.entrySet().hashCode());


      
        System.out.println(key1.hashCode()+key2.hashCode()+key5.hashCode()+key7.hashCode()+key9.hashCode());

    }
}