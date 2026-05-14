import java.util.Scanner;

public class nextpermut {
    public static void reverse(int[] arr,int s,int l){
        int n = arr.length;
        for(int i=s; i<(s+l)/2; i++){
            int t = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = t;
        }
    }
    public static void nextPermutation(int[] arr){
        int n = arr.length;
        int index = -1;
        for(int i=n-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(arr,0,n-1);
            return;
        }
        int min = 1000;
        int store = -1;
        for(int i=n-1; i>index; i--){
               if(arr[i]<min){
                min = arr[i];
                store = i;
               }
        }
        int t = arr[index];
        arr[index] = arr[store];
        arr[store] = t;
        reverse(arr,index,n-1);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        nextPermutation(arr);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
