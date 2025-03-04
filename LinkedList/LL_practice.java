class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}
class LL{
    Node head = null;
    public void insertion(int val){
        Node nn = new Node(val);
        if(head == null){
            head = nn;
            return;
        }
        nn.next = head;
        head = nn;
    }
    public void display(){
        while(head!=null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }
}
public class LL_practice {
      public static void main(String[] args) {
        LL l = new LL();
        l.insertion(10);
        l.insertion(30);
        l.insertion(90);
        l.insertion(944);
        l.insertion(94444);
        l.display();
      }
}
