import java.util.*;
public class reversearray{
    public static void swap(int[] arr,int l, int r){
        int t = arr[l];
            arr[l]=arr[r];
            arr[r]=t;
    }
    public static void reverseRecur(int[] arr, int l, int r){
        if(l>=r){
            return;
        }
        swap(arr,l,r);
        reverseRecur(arr, l+1, r-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        reverseRecur(arr,0,n-1);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}