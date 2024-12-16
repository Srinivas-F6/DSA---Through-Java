// Singly Linked Lists 
// 1. Insertions and Deletions at starting and Ending positions...
// 2. Delete the given Key values....

package LinkedList;
class Node{
    int val;
    Node next;
   public Node(int val){
       this.val = val;
       this.next = null;
   }
 }
class LL{
    Node head;
    int size;
    public LL(){
        head = null;
        this.size = 0;
    }
    public void insertAtbegin(int val){
        Node nn = new Node(val);
        size++;
          if(head == null){
            head = nn;
            return;
          }
          nn.next = head;
          head = nn;
    }
    public void insertAtEnd(int val){
        Node nn = new Node(val);
        if(head == null){
           head = nn;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = nn;
        }
        size++;
    }
    public void deleteAtBegin(){
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        head = head.next;
    }

    public void deleteAtEnd(){
        size--;
        if(head==null || head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }
    public void deleteKey(int key){
        if(head!=null && head.val == key){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next!=null && head!=null){
            if(temp.next.val == key){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        size--;
    }
    public void print(){
       Node temp = head;
       while(temp!=null){
        System.out.print(temp.val + "->");
        temp = temp.next;
       }
       System.out.println(" "+size);
    }
}
public class Single_LL {
    public static void main(String[] args) {
        LL l = new LL();
        l.insertAtEnd(10);
        l.insertAtEnd(20);
        l.insertAtEnd(94);
        l.insertAtEnd(8393);
        l.insertAtbegin(22);
        l.print();
        System.out.println();
        l.deleteKey(94);
        l.print();
        System.out.println();
        l.insertAtEnd(9334);
        l.insertAtEnd(83393);
        l.deleteAtBegin();
        l.print();
        l.deleteAtEnd();
        l.print();
    }
}
