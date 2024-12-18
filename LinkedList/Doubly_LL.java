// Doubly Linked lists Operations-->Insertions, deletions.....
class Node{
    int val;
    Node next,prev;
    Node(int val){
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
class DLL{
    Node head;
    DLL(){
        this.head = null;
    }
   public void insertFirst(int val){
       Node node = new Node(val);
       if(head == null){
        head = node;
        return;
       }
       head.prev = node;
       node.next = head;
       head = node;
   }
   public void insertEnd(int val){
      Node nn = new Node(val);
      if(head == null){
        head = nn;
        return;
      }
      Node temp = head;
      while(temp.next!=null){
         temp = temp.next;    
      }
      nn.prev = temp;
      temp.next = nn;
      nn.next = null;
   }
   public void insertAtkey(int key,int val){
      Node nn = new Node(val);
      Node temp = head;
      while(temp!=null && temp.val!=key){
        temp = temp.next;
      }
      nn.next = temp.next;
      nn.prev = temp;
      if(temp.next!=null){
        temp.next.prev = nn;
      }
      temp.next = nn;
   }
   public void deleteKey(int key) {
    if (head == null) {
        System.out.println("List is empty.");
        return;
    }
    if (head.val == key) { 
        if (head != null) {
            head = head.next;
            return;
        }
    }
    Node temp = head;
    while (temp != null && temp.val != key) {
        temp = temp.next;
    }
    if (temp == null) {
        System.out.println("Key not found");
        return;
    }
    if (temp.next != null) {
        temp.next.prev = temp.prev;
    }
    if (temp.prev != null) {
        temp.prev.next = temp.next;
    }
}
   public void deleteLast(){
     if(head == null){
        System.out.println("List is Empty");
        return;
     }
     if(head.next == null){
        head = null;
        return;
     }
     Node temp = head;
     while(temp.next.next!=null){
        temp = temp.next;
     }
     temp.next = null;
   }

   public void display(){
    Node temp = head;
    Node last = null;
    System.out.println("Forward Printing: ");
    while(temp!= null){
        last = temp;
        System.out.print(temp.val+"->");
        temp = temp.next;
    }
    System.out.println("\nBackward Printing: ");
    while(last!=null){
      System.out.print(last.val+"->");
       last = last.prev;
    }
   }
}

public class Doubly_LL {
    public static void main(String[] args) {
        DLL  dl = new DLL();
        dl.insertFirst(11);
        dl.insertFirst(33);
        dl.insertEnd(101);
        dl.insertEnd(333);
        dl.insertAtkey(333, 83939);
        dl.insertEnd(113);
        dl.display();
         dl.deleteLast();
        dl.insertFirst(33);
        dl.display();
        dl.deleteKey(101);
        
    }   
}
