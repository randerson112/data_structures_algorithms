/*
 * Linked List
 * 
 * A linked list is a linear data structure similar to an array, but elements are not stored in
 * contiguous memory. Instead, each element is stored in a node that contains the data and a pointer
 * (or reference) to the next node in the sequence. Some linked lists can be doubly linked, meaning
 * each node stores a pointer to the next and previous nodes.
 * 
 * This design makes insertion and deletion more efficient than in an array. In an array, removing
 * or inserting an element may require shifting many elements, but in a linked list, we only need to
 * adjust a few pointers. At the same time, searching for elements in a linked list is slower than an array
 * beacuse we must traverse the linked list starting at the head.
 * 
 * Common Operations:
 * - add(element): inserts an element at the end (or a specified position) in the list.
 * - remove(element): removes the first occurrence of the specified element.
 * - insert(index, element): inserts an element at a specific index.
 * - get(index): returns the element at the specified index.
 * - isEmpty(): checks whether the list contains any nodes.
 * - size(): returns the number of elements in the list.
 * 
 * Real-world Examples:
 * - Music playlists where each song links to the next.
 * - Web browser history (each page links to the next and previous page).
 * - Image viewers that allow navigation between photos sequentially.
 * - Undo/Redo functionality in text editors.
 */

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // A linked list can mimic a stack in Java
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");

        System.out.println("Using as a stack:");
        System.out.println(linkedList);
        while (!linkedList.isEmpty()) {
            System.out.println(linkedList.pop());
        }
        System.out.println();

        // A linked list can also mimic a queue in Java
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        System.out.println("Using as a queue:");
        System.out.println(linkedList);
        while (!linkedList.isEmpty()) {
            System.out.println(linkedList.poll());
        }
        System.out.println();

        // Adding and removing elements in a linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("Before adding:");
        System.out.println(linkedList);
        System.out.println();

        linkedList.add(2, "Mango");

        System.out.println("Added Mango at index 2:");
        System.out.println(linkedList);
        System.out.println();

        linkedList.remove("Banana");

        System.out.println("Removed Banana:");
        System.out.println(linkedList);
        System.out.println();

        System.out.println("Index of Orange:");
        System.out.println(linkedList.indexOf("Orange"));
    }
}