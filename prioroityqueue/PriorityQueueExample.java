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
        
        // It conisders the highest priority accoirding to the descending order(highest value having highest priority)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // It considerrs the highest priority according to the ascending order(lowest value having highest priority)
        // PriorityQueue<Integer> pq = new PriorityQueue<>();

        int n = sc.nextInt();
        int[] arr = new int[n];
      
        for(int i=0; i<n; i++){
          arr[i] = sc.nextInt();
          pq.add(arr[i]);
       
        }
        
        
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
