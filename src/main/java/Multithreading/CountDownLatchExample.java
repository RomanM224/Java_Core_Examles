package Multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

public class CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        new Work(countDownLatch);
        new Work(countDownLatch);
        new Work(countDownLatch);
        
        countDownLatch.await();
        System.out.println("all job done");
    }

}

class Work extends Thread {

    CountDownLatch countDownLatch;

    public Work(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(ThreadLocalRandom.current().nextInt(1000, 5001));
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("done work");
        countDownLatch.countDown();
    }

}
