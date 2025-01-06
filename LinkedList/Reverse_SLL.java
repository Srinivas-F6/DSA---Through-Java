class Node{
    int val;
    Node next;
    Node(int val){
        this.val =val;
        this.next = null;
    }
}
class LL{
    Node head = null;
    // LL(){
    //     this.head = null;
    // }
    public void insertion(int val){
        Node nn = new Node(val);
        if(head == null){
            head = nn;
            return;
        }
        nn.next = head;
        head = nn;
    }
    public void reverseLL(){
        Node temp = head;
        Node prev = null;
        Node nex = head.next;
        while(temp.next!=null){
            temp.next = prev;
            prev = temp;
            temp = nex;
            nex = nex.next;
        }
        head = prev;
    }
    public void printRll(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
public class Reverse_SLL {
    public static void main(String[] args) {
        LL rsl = new LL();
        rsl.insertion(11);
        rsl.insertion(12);
        rsl.insertion(14);
        rsl.insertion(13);
        rsl.printRll();
        System.out.println("Print Reverse: ");
        rsl.reverseLL();
        rsl.printRll();

    }
}
