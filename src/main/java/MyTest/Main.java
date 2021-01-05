package MyTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.setName(null);
        System.out.println(car);
       

    }
    
    public static void plus(AtomicInteger i) {
        i.addAndGet(10);
    }

}
