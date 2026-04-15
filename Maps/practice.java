import java.util.*;
public class practice {
    public static void main(String[] args) {
        int arr[] = {10,20,39,10,95,93,94,10,10};
        Map<Integer,Integer> hm = new TreeMap<>(Collections.reverseOrder());
        for(int i=0; i<arr.length; i++){
             if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
             }
             else{
                hm.put(arr[i], hm.get(arr[i])+1);
             }
        }
        System.out.println(hm);
    }
}
