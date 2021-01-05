package Collections.CollectionsExamples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

public class MyQueueTest {
    
    @Test
    public void whenRemoveOnes() {
        MyQueue<String> queue = new MyQueue<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");
        assertEquals(queue.remove(), "first");
        assertEquals(queue.remove(), "second");
        assertEquals(queue.remove(), "third");
    }
    
    @Test
    public void whenIterate() {
        MyQueue<String> queue = new MyQueue<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");
        Iterator<String> itr = queue.iterator();
        assertEquals(itr.next(), "first");
        assertEquals(itr.next(), "second");
        assertEquals(itr.next(), "third");
    }

}
