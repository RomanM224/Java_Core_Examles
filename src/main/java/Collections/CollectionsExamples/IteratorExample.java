package Collections.CollectionsExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExample {

    public static void main(String[] args) {
        iteratorExample();
        
  //      listIteratorExample();
    }

    public static void iteratorExample() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // Iterator to traverse the list
        Iterator iterator = list.iterator();
        System.out.println("List elements : " + list);
        System.out.println(iterator.next());
        iterator.remove();
        System.out.println(list);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }        
    }

    public static void listIteratorExample() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        // ListIterator to traverse the list
        ListIterator iterator = list.listIterator();
        // Traversing the list in forward direction
        System.out.println("Displaying list elements in forward direction : ");
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
        // Traversing the list in backward direction
        System.out.println("Displaying list elements in backward direction : ");
        while (iterator.hasPrevious())
            System.out.print(iterator.previous() + " ");
        System.out.println();
    }

}
