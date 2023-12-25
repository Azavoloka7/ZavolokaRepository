package collectiosJava;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList<T> {
    private Node<T> head;

    // Constructor: initializes an empty linked list
    public LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end of the linked list
    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    
    public void delete(T value) {
        if (head == null) {
            return; // List is empty, nothing to delete
        }

        // If the value to be deleted is in the head node
        if (head.data.equals(value)) {
            head = head.next;
            return;
        }

        Node<T> current = head;
        Node<T> previous = null;

        // Traverse the list to find the node with the given value
        while (current != null && !current.data.equals(value)) {
            previous = current;
            current = current.next;
        }

        // If the value is not found
        if (current == null) {
            return;
        }

        // Remove the node from the list
        previous.next = current.next;
    }

    // Method to display the linked list
    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

