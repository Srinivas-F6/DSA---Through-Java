class CustomStack{
    private int[] data;
    int top = -1;
    public CustomStack(int size){
        data = new int[size];
    }
    public void push(int val) {
      if(isFull()){
        System.out.println("Stack is Full");
        return;
      }
      ++top;
      data[top] = val;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        return data[top--];
    }
    public boolean  isFull(){
        return top == data.length-1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void display(){
       for(int i=0; i<=top; i++){
        System.out.print(data[i]+" ");
       }
    }
}
public class CustommStack {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        stack.push(38);
        stack.push(44);
        stack.push(940);
        stack.push(94);
        stack.push(933);
        stack.display();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();
    }
}
