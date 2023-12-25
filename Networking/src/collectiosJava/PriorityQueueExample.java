package collectiosJava;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Creating a PriorityQueue using the Queue interface
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the priority queue
        priorityQueue.offer(55);
        priorityQueue.offer(30); // Priority: default natural order
        priorityQueue.offer(10); // Priority: default natural order
        priorityQueue.offer(50); // Priority: default natural order
        priorityQueue.offer(20); // Priority: default natural order
        
        System.out.println("PriorityQueue elements: " + priorityQueue);

        // Polling elements from the priority queue
        while (!priorityQueue.isEmpty()) {
            System.out.println("Polling: " + priorityQueue.poll());
            System.out.println(priorityQueue);
        }
    }
}
