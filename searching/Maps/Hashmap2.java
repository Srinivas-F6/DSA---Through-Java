package Maps;
import java.util.HashMap;
import java.util.Map;

public class Hashmap2 {
    public static void main(String[] args) {
        HashMap<String,Integer> lst = new HashMap<>();

    // 1) put(K key, V value): Inserts a key-value pair.

        lst.put("cricket", 11);
        lst.put("volley Ball", 6);
        lst.put("kabaddi", 7);

// Basic Methods
// 1) put(K key, V value): Inserts a key-value pair.
// 2) get(Object key): Retrieves the value for a given key.
// 3) remove(Object key): Deletes the key-value pair associated with the specified key.
// 4) containsKey(Object key): Checks if a key exists in the map.
// 5) keySet(): Returns a set of all keys.
// 6) values(): Returns a collection of all values.
// 7) entrySet(): Returns a set of all key-value pairs.

// 2) get(Object key): Retrieves the value for a given key.
   
    System.out.println(lst.get("kabaddi"));
    System.out.println(lst.get("cricket"));
    System.out.println(lst.get("kho-kho"));

// 5) keySet(): Returns a set of all keys.

      for(String ele: lst.keySet()){
        System.out.print(ele +" ");
        System.out.println(lst.get(ele));
      }
// 6) values(): Returns a collection of all values. 
        for (int ele : lst.values()){
            System.out.print(ele+" ");
        }

// 7) entrySet(): Returns a set of all key-value pairs.
       for(Map.Entry<String,Integer> e: lst.entrySet()){
          System.out.println(e.getValue()+"  "+e.getKey());
       }
    //    print the entire map
    System.out.println(lst);

    // get the map size by using size function
    System.out.println(lst.size());
    }
}

