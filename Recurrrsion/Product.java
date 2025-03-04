import java.util.Scanner;

public class Product {
    public static int product_1toN(int num){
        if(num<=1){
         return 1;
        }
        return num*product_1toN(num-1);
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(product_1toN(n));
  }   
}
