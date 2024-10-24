package Maps;
import java.util.*;
public class HasMap1 {
    public static void main(String[] args) {
        // syntax for creation of hashmap
        // HashMap <key,value> name = new HashMap<>();
        HashMap<String,Integer> map = new HashMap<>();

        // Insertion
        map.put("Srinivas",61);
        map.put("sumanth",62);
        map.put("Mohan",63);
        System.out.println(map);  // output is: {Mohan=63, Srinivas=61, sumanth=62} // It is unordered 

        // update the values in the map 
        map.put("sumanth",65);  // if the key is exist in the map, it's value is updated
        System.out.println(map);

        // searching the keys:   map.containsKey("key")
        if(map.containsKey("Srinivas")){
            System.out.println("Key is present in the map");
        }

        if(map.containsValue(63)){
            System.out.println("Value is present in the map");
        }
        // Searching map contains values   map.containsValue("Value")
        else {
            System.out.println("Key is not present in the map");
        } 

        // get the values from the existing keys in the map by using map.get("Key")

        System.out.println(map.get("mohan")); // output is null  i.e. key is not existing in the map
        System.out.println(map.get("Mohan")); // output is 63 ...bcoz key is existing in the map
       

        // Iteration in hashmap
        // syntax:
        // for (int i: arr) 
        // hashmap iteration syntax also similar to for-each loop
        // for(Map.Entry<String,Integer> e: map.entrySet())   ...keep it in for loop

        // Map: An object that maps keys to values, with no duplicate keys allowed. Each key 
        //      can map to at most one value.
        //            Implementations:
        //                     HashMap
          
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Store the keys in a set
        // This is another type of iteration
        Set<String> keys = map.keySet();
        for(String ele: keys){
            System.out.println(ele+" "+map.get(ele));
        }

        // Remove the pair from the map using remove 
        map.remove("sumanth");
        System.out.println(map);  //output is : {Mohan=63, Srinivas=61}

    }
}
