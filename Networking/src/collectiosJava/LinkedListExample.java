package collectiosJava;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a linked list of integers
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Appending elements to the linked list
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(30);
       
        // Displaying the linked list
        System.out.print("Linked List elements: ");
        linkedList.display();

        // Appending more elements
        linkedList.append(40);
        linkedList.append(50);
        
        //Deleting adding by zavoloka
        linkedList.delete(20);
        System.out.println("Linked list after adding elements '40', '50' and deleting element '20':");
        linkedList.display();

        // Displaying the updated linked list
        
    }
}