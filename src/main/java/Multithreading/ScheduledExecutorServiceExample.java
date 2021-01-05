package Multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import Multithreading.ExecutorsExample.MyCallable;
import Multithreading.ExecutorsExample.MyRunnable;

public class ScheduledExecutorServiceExample {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.schedule(new MyThread(), 3, TimeUnit.SECONDS);

    }
    
    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println(1);
        }
    }

}
