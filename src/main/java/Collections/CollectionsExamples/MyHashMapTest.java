package Collections.CollectionsExamples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class MyHashMapTest {

    @Test
    public void testMyMap() {
        MyHashMap<String, String> myMap = new MyHashMap<>();
        myMap.put("USA", "Washington DC");
        myMap.put("Nepal", "Kathmandu");
        myMap.put("India", "New Delhi");
        myMap.put("Australia", "Sydney");
        assertNotNull(myMap);
        assertEquals(4, myMap.size());
        assertEquals("Kathmandu", myMap.get("Nepal"));
        assertEquals("Sydney", myMap.get("Australia"));
    }
}
