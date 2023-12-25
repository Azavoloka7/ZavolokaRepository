package collectiosJava;

import java.util.LinkedList;

class MyQueue<T> {
    private LinkedList<T> queue = new LinkedList<>();

    // Enqueue: Add an element to the end of the queue
    public void enqueue(T item) {
        queue.addLast(item);
    }

    // Dequeue: Remove and return the element from the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.removeFirst();
    }

    // Peek: Return the element at the front of the queue without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.getFirst();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return queue.size();
    }
}

public class QueueExample {
    public static void main(String[] args) {
        // Creating a queue of integers
        MyQueue<Integer> myQueue = new MyQueue<>();

        // Enqueue some elements
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        myQueue.enqueue(50);
        
        // Print the size of the queue
        System.out.println("Queue size: " + myQueue.size());

        // Peek at the front element without removing it
        System.out.println("Front element: " + myQueue.peek());

        // Dequeue and print the removed element
        System.out.println("Dequeued element: " + myQueue.dequeue());

        // Print the size of the queue after dequeue
        System.out.println("Queue size after dequeue: " + myQueue.size());
    }
}
