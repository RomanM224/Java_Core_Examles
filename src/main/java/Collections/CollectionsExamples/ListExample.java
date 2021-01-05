package Collections.CollectionsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {

    public static void main(String[] args) {
//        changePersonInArrayList();
//        
//        changePersonInArray();
//        
//        changeIntegerInArrayList();
//          
//        changeIntegerInArrayList();
//        
//        changeStringInArrayList();
//
//        changeStringInLinkedList();
        
//        addGetDeleteArrayList();
        
        addGetDeleteLinkedList();
    }

    public static void changePersonInArrayList() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "John"));
        persons.add(new Person(2, "Tina"));
        persons.add(new Person(3, "Ida"));
        System.out.println(persons);
        for (Person person : persons) {
            person = new Person(1, "asd");
        }
//        for(Person person : persons) {
//            person.setName("Ivan");
//        }
        System.out.println(persons);
        persons.remove(2);
        System.out.println(persons);
    }

    public static void changePersonInArray() {
        Person[] persons = new Person[5];
        persons[0] = new Person(1, "John");
        persons[1] = new Person(2, "Tina");
        persons[2] = new Person(3, "Ida");
        for (Person person : persons) {
            System.out.println(person);
        }
        for (Person person : persons) {
            person = new Person(1, "asd");
        }
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person(1, "asd");
        }
        for (Person person : persons) {
            System.out.println(person);
        }
        for (Person person : persons) {
            person.setName("Ivan");
        }
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public static void changeIntegerInArrayList() {
        // Integer it is immutable object, so we can not change it
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers);
        for (Integer num : numbers) {
            num = 2;
        }
        System.out.println(numbers);
        Iterator itr = numbers.iterator();
    }

    public static void changeStringInArrayList() {
        List<String> stringsArrayList = new ArrayList<>();
        stringsArrayList.add("a1");
        stringsArrayList.add("a2");
        stringsArrayList.add("a3");
        System.out.println("ArrayList: " + stringsArrayList);
        System.out.println("\nget(0): " + stringsArrayList.get(0));
        stringsArrayList.remove(1);
        System.out.println("remove(1): " + stringsArrayList);
        stringsArrayList = stringsArrayList.stream().map(str -> str + "_new").collect(Collectors.toList());
        System.out.println(stringsArrayList);
    }

    public static void changeStringInLinkedList() {
        List<String> stringLinkList = new LinkedList<>();
        stringLinkList.add("b1");
        stringLinkList.add("b2");
        stringLinkList.add("b3");
        
       
        System.out.println("\nLinked list: " + stringLinkList);
        for (String str : stringLinkList) {
            System.out.print(str + " ");
        }
        System.out.println("\nget(0): " + stringLinkList.get(0));
        stringLinkList.remove(1);
        System.out.println("remove(1): " + stringLinkList);
    }

    public static void addGetDeleteArrayList() {
        List<String> stringsArrayList = new ArrayList<>();
        stringsArrayList.add("a1");
        stringsArrayList.add("a2");
        stringsArrayList.add("a3");
        System.out.println("stringsArrayList - " + stringsArrayList);
        stringsArrayList.add(1, "a4");
        System.out.println("add(1, \"a4\")... - " + stringsArrayList);
        List<String> stringsArrayList2 = new ArrayList<>();
        stringsArrayList2.add("b1");
        stringsArrayList2.add("b2");
        stringsArrayList.addAll(stringsArrayList2);
        System.out.println("stringsArrayList - " + stringsArrayList2);
        System.out.println("addAll(stringsArrayList2)... - " + stringsArrayList);
        stringsArrayList.addAll(0, stringsArrayList2);
        System.out.println("addAll(0, stringsArrayList2)... - " + stringsArrayList);
        System.out.println("stringsArrayList2 - " + stringsArrayList);
        System.out.println("get(1) - " + stringsArrayList.get(1));
        stringsArrayList.remove(0);
        System.out.println("remove(0) - " + stringsArrayList);
        stringsArrayList.remove("b2");
        System.out.println("remove(\"b2\") - " + stringsArrayList);
        stringsArrayList.remove("b2");
        System.out.println("remove(\"b2\") - " + stringsArrayList);
        stringsArrayList.removeAll(stringsArrayList2);
        System.out.println("removeAll(stringsArrayList2) - " + stringsArrayList);
        stringsArrayList.set(0, "c1");
        System.out.println("stringsArrayList.set(0, \"c1\") - " + stringsArrayList);
        stringsArrayList.clear();
        System.out.println("clear() - " + stringsArrayList);
    }

    public static void addGetDeleteLinkedList() {
        List<String> stringsLinkedList = new LinkedList<>();
        stringsLinkedList.add("a1");
        stringsLinkedList.add("a2");
        stringsLinkedList.add("a3");
        System.out.println("stringsLinkedList - " + stringsLinkedList);
        stringsLinkedList.add(1, "a4");
        System.out.println("add(1, \"a4\")... - " + stringsLinkedList);
        List<String> stringsArrayList2 = new ArrayList<>();
        stringsArrayList2.add("b1");
        stringsArrayList2.add("b2");
        stringsLinkedList.addAll(stringsArrayList2);
        System.out.println("stringsArrayList2 - " + stringsArrayList2);
        System.out.println("addAll(stringsArrayList2)... - " + stringsLinkedList);
        stringsLinkedList.addAll(0, stringsArrayList2);
        System.out.println("addAll(0, stringsArrayList2)... - " + stringsLinkedList);
        System.out.println("stringsLinkedList - " + stringsLinkedList);
        System.out.println("get(1) - " + stringsLinkedList.get(1));
        stringsLinkedList.remove(0);
        System.out.println("remove(0) - " + stringsLinkedList);
        stringsLinkedList.remove("b2");
        System.out.println("remove(\"b2\") - " + stringsLinkedList);
        stringsLinkedList.remove("b2");
        System.out.println("remove(\"b2\") - " + stringsLinkedList);
        stringsLinkedList.removeAll(stringsArrayList2);
        System.out.println("removeAll(stringsArrayList2) - " + stringsLinkedList);
        stringsLinkedList.set(0, "c1");
        System.out.println("stringsArrayList.set(0, \"c1\") - " + stringsLinkedList);
        stringsLinkedList.clear();
        System.out.println("clear() - " + stringsLinkedList);
    }

}
