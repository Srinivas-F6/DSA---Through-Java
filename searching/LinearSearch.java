package DSThroughJava.searching;
import java.util.*;
public class LinearSearch {
    static int linearSearch(int[] arr,int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=  sc.nextInt();
        }
        int key = sc.nextInt();
        int res=LinearSearch.linearSearch(arr,key);
        for(int ele : arr){
            if(ele == key){
                System.out.println(ele);
            }
        }
        if(res==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at "+res+" index");
        }
        sc.close();
    }
}
