import java.util.*;
public class BinarySearch {
    public static int binary_search(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
        boolean A_bs = arr[low]<arr[high];
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == key){
                return mid;
            }
           if(A_bs){
                if (arr[mid]>key)
                high = mid-1;
                else if (arr[mid]<key)       //This is agonstics Binary Search
                low = mid+1;                 //In Binary search elements are in sorted order, we don't know 
           }                                   // it is decesending or ascending order
           else{                            // i.e we used agonstic BS..In this, we have to find the key easily without depend on sorted order
            if (arr[mid]<key){
            high = mid-1;
            }
            else if (arr[mid]>key){
            low = mid+1;
            }
           }
    }
    return -1;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
       int result = binary_search(arr,target);
       if(result == -1){
        System.out.println("key Not found");
       }
       else{
        System.out.println("Key found at "+result+" index");
       }
       
       sc.close();
    }
}
