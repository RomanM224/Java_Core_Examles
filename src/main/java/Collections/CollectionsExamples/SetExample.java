package Collections.CollectionsExamples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SetExample {

    public static void main(String[] args) {
    //    hashSetExample();
        
       addGetDeleteHashSet(); 
    }
    
    public static void hashSetExample() {
        Set<String> stringsHachSet = new HashSet<String>(); 
        stringsHachSet.add("Geeks"); 
        stringsHachSet.add("For"); 
        stringsHachSet.add("Geeks"); 
        stringsHachSet.add("Example"); 
        stringsHachSet.add("Set"); 
        System.out.println("Set output without the duplicates"); 
        System.out.println(stringsHachSet); 
        for(String str : stringsHachSet) { 
        //    stringsHachSet.remove(str);
        }
        stringsHachSet = stringsHachSet.stream().map(str -> str + "asd").collect(Collectors.toSet());

        System.out.println("\n" + stringsHachSet); 
        stringsHachSet.remove("For");
        System.out.println("\nremove(\"For\"): " + stringsHachSet);
        // Set deonstration using TreeSet 
        System.out.println("Sorted Set after passing into TreeSet"); 
        Set<String> stringsTreeSet = new TreeSet<String>(stringsHachSet); 
        System.out.println(stringsTreeSet); 
        
        Set<Integer> a = new HashSet<Integer>(); 
        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0})); 
        Set<Integer> b = new HashSet<Integer>(); 
        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5})); 
  
        // To find union 
        Set<Integer> union = new HashSet<Integer>(a); 
        union.addAll(b); 
        System.out.print("Union of the two Set"); 
        System.out.println(union); 
  
        // To find intersection 
        Set<Integer> intersection = new HashSet<Integer>(a); 
        intersection.retainAll(b); 
        System.out.print("Intersection of the two Set"); 
        System.out.println(intersection); 
  
        // To find the symmetric difference 
        Set<Integer> difference = new HashSet<Integer>(a); 
        difference.removeAll(b); 
        System.out.print("Difference of the two Set"); 
        System.out.println(difference); 
    }
    
    public static void addGetDeleteHashSet() {
        Set<String> stringsHashSet = new HashSet<>();
        stringsHashSet.add("a1");
        stringsHashSet.add("a2");
        stringsHashSet.add("a3");
        System.out.println("stringsHashSet - " + stringsHashSet);
        Set<String> stringsHashSet2 = new HashSet<>(Arrays.asList(new String[] {"a4", "a5", "a6"}));
        System.out.println("stringsHashSet2 - " + stringsHashSet2);
        stringsHashSet.addAll(stringsHashSet2);
        System.out.println(".addAll(stringsHashSet2) - " + stringsHashSet);
        Iterator<String> itr = stringsHashSet.iterator();
        System.out.println("Iterator.next() - " + itr.next());
        System.out.println("Iterator.next() - " + itr.next());
        System.out.println("stringsHashSet - " + stringsHashSet);
        itr.remove();
        System.out.println("Iterator.remove() - " + stringsHashSet);
        
        Set<Integer> numbers1 = new HashSet<Integer>(Arrays.asList(new Integer[] {1, 2, 3, 4, 5, 6})); 
        System.out.println("numbers1 - " + numbers1);
        Set<Integer> numbers2 = new HashSet<Integer>(Arrays.asList(new Integer[] {4, 5, 6, 7, 8, 9, 0})); 
        System.out.println("numbers1 - " + numbers2);
        Set<Integer> intersection = new HashSet<Integer>(numbers1); 
        Set<Integer> difference = new HashSet<Integer>(numbers2); 
        intersection.retainAll(numbers2); 
        difference.removeAll(numbers1); 
        System.out.println("numbers1.retainAll(numbers2) - " + intersection);
        System.out.println("numbers2.removeAll(numbers1)  - " + difference);
        System.out.println("numbers1 - " + numbers1);
        numbers1.remove(3);
        System.out.println(".remove(3) - " + numbers1);
        
        
    }
}
