import java.util.*;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int c=0;
        int maxi = sc.nextInt();
        for(int i=size-1; i>0; i--){
            if(arr[i]!=arr[i-1] && c<maxi){
                c++;
               if(c==maxi){
                System.out.println(arr[i]);
               }
            }
        }
      sc.close();
    }
}
