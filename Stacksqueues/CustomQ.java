class Customqueue{
    int[] data;
    int end = 0;
    public Customqueue(int size){
        data = new int[size];
    }
    public void insert(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is Full");
        }
        data[end++] = item;
    }
    public void remove()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        for(int i=1; i<end; i++){
            data[i-1] = data[i];
        }
        end--;
    }
    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end == 0;
    }
    public void display(){
        for(int i=0; i<end; i++){
            System.out.print(data[i]+"<-");
        }
        System.err.println("END");
    }
}
public class CustomQ {
    public static void main(String[] args) {
        try{
        Customqueue queue = new Customqueue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(38);
        queue.insert(10);
        queue.insert(20);
        queue.display();
        queue.remove();
        queue.display();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
