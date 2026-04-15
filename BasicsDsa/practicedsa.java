import java.util.*;
public class practicedsa {
    public static void combingpts(int[][] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max = 0;
        int j = arr[0][0];
        for(int i=0; i<arr.length-1; i++){
            if(arr[i][1] <= arr[i+1][0]){
                hm.put(j,max);
                j=arr[i+1][0];
            }
            else{
                max = Math.max(arr[i][1],max);
            }
        }
        hm.put(j,arr[arr.length-1][1]);
        for(int i: hm.keySet()){
            System.out.println(i +" ->"+hm.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] arr = new int[size][2];
        for(int i=0; i<size; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
         practicedsa.combingpts(arr);
        // System.out.println(arr);

    }
}
