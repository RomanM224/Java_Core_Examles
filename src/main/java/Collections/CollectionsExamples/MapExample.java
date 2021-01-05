package Collections.CollectionsExamples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {
        
        addGetDeleteArrayList();
        
        linkedHashMapExample();
    }
    
    public static void forEachHashMap() {
        Map<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("a", new Integer(100));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));
        System.out.println(hm);
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }

        // Returns Set view      
        Set<Map.Entry<String, Integer>> st = hm.entrySet();
        System.out.println();
        for (Map.Entry<String, Integer> me : st) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        } 
    }
    
    public static void addGetDeleteArrayList() {
        Map<Integer, String> stringsHashMap = new HashMap<Integer, String>();
        stringsHashMap.put(1, "a1");
        stringsHashMap.put(2, "a2");
        stringsHashMap.put(3, "a3");
        stringsHashMap.put(4, "a3");
        stringsHashMap.put(5, "a4");
        System.out.println("stringsHashMap.putIfAbsent(6, \"a4\") - " + stringsHashMap.putIfAbsent(6, "a4"));
        System.out.println("stringsArrayList - " + stringsHashMap);
        System.out.println("get(1) - " + stringsHashMap.get(1));        
        stringsHashMap.remove(1);
        System.out.println("remove by key {.remove(1)} - " + stringsHashMap);
        stringsHashMap.remove(3, "a3");
        System.out.println("remove by key and object {.remove(3, \"a3\")} - " + stringsHashMap);
        stringsHashMap.clear();
        System.out.println("clear() - " + stringsHashMap);
    }
    
    public static void linkedHashMapExample() {
        Map<String, String> tramslation = new LinkedHashMap<>();

        tramslation.put("one", "one");
        tramslation.put("two", "two");
        tramslation.put("three", "three");
        tramslation.put("four", "four");

        System.out.println(tramslation.get("three"));

        for (String k : tramslation.keySet()){
            System.out.printf("%s -> %s\n", k, tramslation.get(k));
        }

    }

}
