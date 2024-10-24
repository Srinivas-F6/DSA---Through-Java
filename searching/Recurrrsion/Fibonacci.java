import java.util.Scanner;
public class Fibonacci {
    public static int fibo(int x){
        if(x<2){
            return x;
        }
        return fibo(x-1)+fibo(x-2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         System.out.println(fibo(n));
         sc.close();
    }
}
