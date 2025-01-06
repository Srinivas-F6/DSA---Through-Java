

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}
class Cll{
    Node head = null;
    Node tail = null;
    public void insertion(int val){
        Node nn = new Node(val);
        if(head == null){
            head = nn;
            tail = nn;
            return;
        }
        tail.next = nn;
        nn.next = head;
        head = nn;      // if we assign   ----.tail = nn;   Then node will be  inserted  at the end of the list
    }
    public void deleteAtStart(){
       if(head == null && tail == null){
        System.out.println("List is Empty");
        return;
       }
       if(head.next == null && tail.next == null){
        head = null;
        tail = null;
        return;
       }
       head = head.next;
       tail.next = head;
    }
    public void display(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while(temp!=tail){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println(tail.val);
    }
}
public class Circular_LL {
    public static void main(String[] args) {
        Cll cl = new Cll();
        cl.insertion(10);
        cl.insertion(20);
        cl.insertion(39);
        cl.insertion(40);
        cl.insertion(50);
        cl.deleteAtStart();
        cl.display();

    }
}
