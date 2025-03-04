import java.util.Scanner;

public class Sumofdigits {
    public static int digit_sum(int x){
        if(x == 0){
            return 0;
        }
        return x%10 + digit_sum(x/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(digit_sum(num));
    }
}
