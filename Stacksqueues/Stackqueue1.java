import java.util.*;
public class Stackqueue1 {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(1);  
        // stack.push(2);  
        // stack.push(3);
        // stack.push(4);
        // stack.push(5);
        // System.out.println("Stack: " + stack);
        // System.out.println("Size of stack: " + stack.size());
        // System.out.println("Top element: " + stack.peek());
        // System.out.println("Popped element: " + stack.pop());
        // System.out.println("Stack: " + stack);
        // int s = stack.pop();
        // System.out.println("Popped element: " + s);

        // Queue<Integer> queue = new LinkedList<>();
        // queue.add(33);
        // queue.add(83);
        // queue.add(38);
        // queue.add(483);
        // queue.add(883);
        // queue.add(83);
        // System.out.println(queue);
        // System.out.println("Removed element: "+queue.remove());


        // Deque means Double ended queue ... we can add and delete elements from both the ends

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.addFirst(9);
        System.out.println(deque);
        deque.removeLast();
        deque.addFirst(833);
        deque.add(833);
        System.out.println(deque);
    }
}

