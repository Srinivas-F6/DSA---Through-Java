
import java.util.Scanner;

public class Nto1 {
    public static void Recurrsion_Nto1(int num){
        if(num==1){
            System.out.println(num);
            return;
        }
        System.out.println(num);
        Recurrsion_Nto1(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Nto1.Recurrsion_Nto1(n);
    } 
}
