public class recursion{
    public static void recur(int n){
        if(n==1){
            return;
        }
        for(int i=0; i<1; i++){
            System.out.println(n);
           recur(n-1);
           System.out.println(n);
        }
    }
    public static void main(String[] args) {
         recur(10);
    }
}