/*
 * Stack
 * 
 * A stack is a linear data structure that follows the Last In, First Out (LIFO) principle.
 * 
 * This means that the most recently added element is the first one to be removed.
 * Think of it like a stack of plates — you add (push) a new plate on top, 
 * and when you need one, you remove (pop) the top plate first.
 * 
 * Common operations:
 * - push(element): adds an element to the top of the stack
 * - pop(): removes and returns the element at the top of the stack
 * - peek(): returns the top element without removing it
 * - empty(): checks whether the stack has any elements
 * 
 * Real-world examples:
 * - Undo/Redo functionality in applications
 * - Call stack in programming languages
 * - Backtracking algorithms (like maze solving)
 * 
 */

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        // Push items onto stack
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        // Print items in the stack
        System.out.println("Initial Stack:");
        System.out.println(stack);
        System.out.println();

        // Remove an item from the stack (the top of the stack)
        System.out.println("After pop:");

        String item = stack.pop();

        System.out.println(stack);
        System.out.println(item);

        System.out.println();

        // Retrieve top item of stack without removing it
        System.out.println("Peeking:");

        String nextItem = stack.peek();
        System.out.println(nextItem);

        System.out.println();

        // Searching for item returns item position from the top
        // Remember: Top item is at position 1
        System.out.println("Searching for Skyrim:");
        System.out.println(stack.search("Skyrim"));
    }
}
