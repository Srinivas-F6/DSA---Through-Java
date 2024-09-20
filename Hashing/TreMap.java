package Maps;
import java.util.*;
public class TreMap {
    public static void main(String[] args) {
        Map<String,Integer> tm = new TreeMap<>();
        tm.put("Mohan",23);
        tm.put("Srinivas",24);
        tm.put("Sumanth",36);     // It gives output, what the order we have given as a input
        System.out.println(tm);       //{Mohan=23, Srinivas=24, Sumanth=36}


        for(String names: tm.keySet()){
            System.out.println(names+ " "+tm.get(names));
        }
    }
}
