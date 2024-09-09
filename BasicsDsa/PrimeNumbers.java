import java.util.*;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime((n))){
            System.out.println("The number "+n+" is a prime Number");
        }
        else{
            System.out.println("The number "+n+" is not a prime Number");
        }
    }
    static boolean isPrime(int n){
       if(n<=1){
        return false;
       }
       for(int i=2; i<(n/2)+1; i++){
        if(n%i == 0){
            return false;
          }
       }
      return true;
    }
}
