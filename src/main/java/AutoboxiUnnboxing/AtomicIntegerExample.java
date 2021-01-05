package AutoboxiUnnboxing;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(); //value are 0
        System.out.println(atomicInteger);

        AtomicInteger atomicInteger1 = new AtomicInteger(123);
        int theValue = atomicInteger1.get();  //Getting AtomicInteger value
        System.out.println(theValue);
        
        atomicInteger1.set(234);
        System.out.println(atomicInteger1);   //Set value in AtomicInteger
        
        AtomicInteger atomicInteger3 = new AtomicInteger(2123);
        System.out.println(atomicInteger3);
        int expectedValue = 2123;
        int newValue      = 234;
        atomicInteger3.compareAndSet(expectedValue, newValue);
        System.out.println(atomicInteger3);
        
        System.out.println(atomicInteger3.addAndGet(100));
        System.out.println(atomicInteger3.getAndAdd(100));
        System.out.println(atomicInteger3);
        
    }

}
