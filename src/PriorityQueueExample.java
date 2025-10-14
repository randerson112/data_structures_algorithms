/*
 * Priority Queue
 * 
 * A priority queue is similar to a regular queue, but elements are served based on their priority 
 * rather than the order they were added.
 * 
 * This means that when elements are added, they’re arranged according to their priority (for example,
 * higher or lower numerical value), and the element with the highest priority is served first.
 * 
 * Common Operations:
 * - enqueue(element, priority): adds an element with a given priority.
 * - dequeue(): removes and returns the element with the highest priority.
 * - peek(): returns the element with the highest priority without removing it.
 * - isEmpty(): checks if the queue has any elements.
 * - size(): returns the number of elements in the queue.
 * 
 * Real-world Examples:
 * - Hospital emergency room serves patients with more severe conditions first.
 * - CPU task scheduling, high-priority processes are executed before lower-priority ones.
 * - Airline boarding, first-class and priority passengers board before economy.
 * - Dijkstra’s algorithm (shortest path), nodes with the lowest current distance are processed first.
 * - Printer queue with urgency, urgent print jobs are processed before normal ones.
 */

import java.util.Queue;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        // Priority queue to store GPAs, serving higher scores first
        Queue<Double> gpaQueueAscending = new PriorityQueue<Double>();

        gpaQueueAscending.offer(3.0);
        gpaQueueAscending.offer(2.5);
        gpaQueueAscending.offer(4.0);
        gpaQueueAscending.offer(1.5);
        gpaQueueAscending.offer(2.0);

        while (!gpaQueueAscending.isEmpty()) {
            System.out.println(gpaQueueAscending.poll());
        }
        System.out.println();

        // Priority queue to store GPAs, serving lower scores first
        Queue<Double> gpaQueueDescending = new PriorityQueue<Double>(Collections.reverseOrder());

        gpaQueueDescending.offer(3.0);
        gpaQueueDescending.offer(2.5);
        gpaQueueDescending.offer(4.0);
        gpaQueueDescending.offer(1.5);
        gpaQueueDescending.offer(2.0);

        while (!gpaQueueDescending.isEmpty()) {
            System.out.println(gpaQueueDescending.poll());
        }
        System.out.println();
        
        // Priority queue to store letter grades, serving higher grades first
        Queue<String> gradesAscending = new PriorityQueue<String>();

        gradesAscending.offer("B");
        gradesAscending.offer("C");
        gradesAscending.offer("A");
        gradesAscending.offer("D");
        gradesAscending.offer("F");

        while (!gradesAscending.isEmpty()) {
            System.out.println(gradesAscending.poll());
        }
    }
}