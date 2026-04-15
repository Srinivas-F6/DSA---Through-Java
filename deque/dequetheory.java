/*package deque;

public class dequetheory {
    public static void main(String[] args) {
        In Java, a Deque (pronounced "deck") is a double-ended queue that allows you 
        to add or remove elements from both ends—the front (head) and the back (tail).
        It’s part of the Java Collections Framework and is available in the java.util package.



        Deque stands for Double Ended Queue. It is an interface in Java that extends the Queue interface. You can use it as:

        A queue (FIFO – First In, First Out)
        A stack (LIFO – Last In, First Out)

    🔹 Insertion Operations
        Method	Description
             addFirst(E e)	Inserts the element at the front (throws exception if full).
             addLast(E e)	Inserts the element at the end (throws exception if full).
             offerFirst(E e)	Inserts the element at the front (returns false if unable).
             offerLast(E e)	Inserts the element at the end (returns false if unable).
             push(E e)	Adds the element at the front (stack-style, same as addFirst)

    🔹 Removal Operations
        Method	Description
             removeFirst()	Removes and returns the first element (throws exception if empty).
             removeLast()	Removes and returns the last element (throws exception if empty).
             pollFirst()	Removes and returns the first element, or null if empty.
             pollLast()	Removes and returns the last element, or null if empty.
             pop()	Removes and returns the first element (stack-style, same as removeFirst).

    🔹 Examination (Peek) Operations
        Method	Description
             getFirst()	Returns the first element (throws exception if empty).
             getLast()	Returns the last element (throws exception if empty).
             peekFirst()	Returns the first element, or null if empty.
             peekLast()	Returns the last element, or null if empty.
             peek()	Returns the element at the front (stack-style, same as peekFirst).

    🔹 Containment and Removal
       Method	Description
             removeFirstOccurrence(Object o)	Removes the first occurrence of the element (front to back).
             removeLastOccurrence(Object o)	Removes the last occurrence of the element (back to front).
             contains(Object o)	Returns true if the deque contains the element.
             remove(Object o)	Removes a single instance of the specified element.

    🔹 Bulk and Utility Operations (from Collection interface)
        Method	Description
             size()	Returns the number of elements in the deque.
             isEmpty()	Returns true if the deque is empty.
             clear()	Removes all elements.
             iterator()	Returns an iterator over the elements (front to back).
             descendingIterator()	Returns an iterator in reverse order (back to front).
             toArray()	Converts deque to an array.
        
    }
}


*/
