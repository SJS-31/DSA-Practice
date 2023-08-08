// package HashMap;
// package HashMap;
import java.util.*;


public class HashMapPrac {

    static void HashMapMethod(){
        //Syntax
        Map<String,Integer> mp=new HashMap<>();

        //Add Elements
        mp.put("SJS", 20);
        mp.put("Ram", 21);
        mp.put("Shyam", 22);
        mp.put("Anuj", 23);

        //Getting value ofa key from the hashmap
        System.out.println(mp.get("SJS"));   

        //Changing/upating value of a key 
        mp.put("Ram", 25);

        //Removing a pair
        System.out.println(mp.remove("Anuj"));
        System.out.println(mp.get("Anuj"));

        //Checking a key
        System.out.println(mp.containsKey("Anuj"));

        // Get all keys
        System.out.println(mp.keySet());

        // Get all values
        System.out.println(mp.values());

        //Get all entries
        System.out.println(mp.entrySet());

        //Traversing all entries
        for (String key : mp.keySet()) {
            System.out.printf("Ae of %s is %d\n",key, mp.get(key));
        }

        System.out.println();
        
        for (Map.Entry<String, Integer> e: mp.entrySet()) {
            System.out.printf("Ae of %s is %d\n",e.getKey(), e.getValue());
        }
        
        System.out.println();

        for (var e: mp.entrySet()) {
            System.out.printf("Ae of %s is %d\n",e.getKey(), e.getValue());
        }


    }
    public static void main(String[] args) {
        HashMapMethod();
    }
}
