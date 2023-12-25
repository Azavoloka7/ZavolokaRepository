import exampleThree.Human;
import exampleThree.Node;

import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
        Map<Human, String> humanMap = new HashMap<>();
        Human person4 = new Human( 18, "Anastasia" );
        Human person7 = new Human( 45, "Sergiy" );
        Human person5 = new Human( 33, "Pavel" );
        Human person1 = new Human( 33, "Alexei" );
        Human person2 = new Human( 30, "Alice" );
        Human person3 = new Human( 33, "Anatolii" );


        humanMap.put( person1, "Person 1" );
        humanMap.put( person2, "Person 2" );
        humanMap.put( person3, "Person 3" );
        humanMap.put( person4, "Person 4" );
        humanMap.put( person5, "Person 5" );
        humanMap.put( person7, "Person 7" );
        // Retrieving values from the map
        // System.out.println(humanMap.get(new Human(25, "John"))); // Should print "Person 1"

/*
        Node<Human> node1 = new Node<>(new Human(25, "John"));
        Node<Human> node2 = new Node<>(new Human(30, "Alice"));
        Node<Human> node3 = new Node<>(new Human(22, "Bob"));
        Node<Human> node4 = new Node<>(new Human(33, "Pavel"));
        Node<Human> node5 = new Node<>(new Human(33, "Anatolii"));
        // Connecting nodes to form a linked list
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);



        // Traversing the linked list
        Node<Human> current = node1;
        while (current != null) {
            System.out.print("\ncurrent.getData().hashCode()="+current.getData().hashCode()+"\n");

            System.out.println(current.getData().toString());
            current = current.getNext();
        }

        System.out.println(node1.getData().toString()); */
        System.out.println( humanMap.entrySet().toString() );



        System.out.println( " HashCodes:" + "\nhumanMap.get(person1).hashCode()='" + humanMap.get( person1 ).hashCode()
                + "'\nhumanMap.get(person2).hashCode()='" + humanMap.get( person2 ).hashCode() + "'\nhumanMap.get(person3).hashCode()='" + humanMap.get( person3 ).hashCode()
                + "'\nhumanMap.get(person4).hashCode()='" + humanMap.get( person4 ).hashCode() + "'\nhumanMap.get(person5).hashCode()='" + humanMap.get( person5 ).hashCode()
                + "'\nhumanMap.get(person7).hashCode()='" + humanMap.get( person7 ).hashCode()+"'");


        System.out.println( humanMap.hashCode() );


        System.out.println("person1.clone() = {"+person1.clone().toString()+"}");

        System.out.println("person1.clone().equals(person1)='"+person1.clone().equals(person1)+"'");
        System.out.println("person1.clone().equals(person3)='"+person1.clone().equals(person3)+"'");

        System.out.println("person1.hashCode()={"+person1.hashCode()+"}\n person1.clone().hashCode()={"+person1.clone().hashCode()+"}");

    }
}