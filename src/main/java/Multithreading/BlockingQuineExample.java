package Multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class BlockingQuineExample {

    public static void main(String[] args) {
        BlockingQueue<String> queue = new PriorityBlockingQueue<>();
        

        new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println(queue.take());
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            };
        }.start();
        
        new Thread() {
            @Override
            public void run() {
                queue.add("Hello");
            };
        }.start();
        
    }
    
    

}
