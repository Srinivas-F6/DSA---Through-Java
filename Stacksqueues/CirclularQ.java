class Circularqueue{
    int[] data;
    int size=0;
    int front=0,end =0;
    public Circularqueue(int size) {
        data = new int[size];
    }
    public void insert(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is Full");
        }
        data[end++] = item;
        end = end % data.length;
        size++;
    }
    public void remove()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        front++;
        front = front % data.length;
        size--;
    }
    public boolean isFull(){
        return size == data.length;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void display(){
        int i = front;
        do { 
            System.out.print(data[i]+"-->");
            i++;
            i%=data.length;
        } while (i!=end);
    }
    
}
public class CirclularQ {
    public static void main(String[] args) {
        try {
        Circularqueue  cqueue = new Circularqueue(5);
          cqueue.insert(9);
          cqueue.insert(10);
          cqueue.insert(911);
          cqueue.insert(110);
          cqueue.insert(91);
          cqueue.display();
          cqueue.remove();
          cqueue.display();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
