import java.util.*;
public class PriorityQueueExample {

    public static void displayPriorityQueue(PriorityQueue<Integer> pq) {
        System.out.println("Current Priority Queue: " + pq);
    }
    
    
    public static boolean containsElement(PriorityQueue<Integer> pq, int element) {
        return pq.contains(element);
    }

    
    public static boolean removeElement(PriorityQueue<Integer> pq, int element) {
        return pq.remove(element);
    }

    
    public static int getSize(PriorityQueue<Integer> pq) {
        return pq.size();
    }

    
    public static int peekElement(PriorityQueue<Integer> pq) {
        return pq.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // Add elements into the priority queue
        pq.add(100);
        pq.add(83);
        pq.add(833);
        pq.add(33);
        
        
        displayPriorityQueue(pq);
        
        
        System.out.println("Size of Priority Queue: " + getSize(pq));
        
        
        System.out.println("Smallest Element (Peek): " + peekElement(pq));
        
        
        int elementToCheck = 83;
        if (containsElement(pq, elementToCheck)) {
            System.out.println("Priority Queue contains " + elementToCheck);
        } else {
            System.out.println("Priority Queue does not contain " + elementToCheck);
        }
        
        
        int elementToRemove = 833;
        if (removeElement(pq, elementToRemove)) {
            System.out.println("Successfully removed " + elementToRemove);
        } else {
            System.out.println("Element " + elementToRemove + " not found in the PriorityQueue");
        }
        
        System.out.println("Remove the highest priority elemet: "+pq.poll());
     
        System.out.println("Elements in priority order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
        
        
        System.out.println("Final size of Priority Queue: " + pq.size());
    }
}
