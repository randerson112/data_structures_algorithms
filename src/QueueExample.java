/*
 * Queue
 * 
 * A queue is a linear data structure that follows the First In, First Out (FIFO) principle.
 * 
 * This means that the first element added is at the head of the queue and will be the next one
 * to be removed. The most recently added element is at the tail and will be removed last. Elements can
 * be added (enqueue) to the tail and removed (dequeue) from the head.
 * 
 * Common Operations:
 * - enqueue(element): adds an element to the tail of the queue.
 * - dequeue(): removes the element at the head of the queue.
 * - peek(): returns the element at the head of the queue without removing it.
 * - isEmpty(): checks if the queue has any elements in it.
 * - size(): returns the number of elements in the queue.
 * 
 * Real-world Examples:
 * - A line of people waiting at a ticket counter (first person in line gets served first).
 * - Tasks waiting to be processed by a printer.
 * - Network data packets waiting to be transmitted.
 * - Customer service requests being handled in order.
 */

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        // Add elements to queue
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        // Print elements in the initial queue
        System.out.println("Initial Queue:");
        System.out.println(queue);
        System.out.println();

        // Removes the element at the front of queue
        String removed = queue.poll();

        System.out.println("After dequeue:");
        System.out.println(queue);
        System.out.println("Removed: " + removed);
        System.out.println();

        // Peek at the element at the head of queue
        System.out.println("Peeking at the next person in queue:");
        System.out.println(queue.peek());
    }
}
