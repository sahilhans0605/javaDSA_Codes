package hashingBasics;

import java.util.HashMap;
import java.util.Set;

public class HashMapBasics {
//    put , get, containsKey, keySet//all functions in O(1)
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 135);
        hm.put("Uk", 35);
        hm.put("US", 15);
        hm.put("Nigeria", 13);
        hm.put("", 5);
        System.out.println(hm);
        System.out.println(hm.get("utopia"));
        System.out.println(hm.get(""));
        Set<String> keys = hm.keySet();//hm.
        System.out.println(keys);//to get all keys of a hashmap...
//        NOw we can iterate over map...using this set
        for (String key : hm.keySet()) {
            System.out.println(key+" "+hm.get(key));
        }
    }


}
