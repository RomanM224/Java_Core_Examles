package Multithreading;

public class DeadLockMain {

    public static void main(String[] args) {
        DeadLockResourceA resourceA = new DeadLockResourceA();
        DeadLockResourceB resourceB = new DeadLockResourceB();
        resourceB.resourceA = resourceA;
        resourceA.resourceB = resourceB;
        DeadLockThread1 thread1 = new DeadLockThread1();
        DeadLockThread2 thread2 = new DeadLockThread2();
        thread1.resourceA = resourceA;
        thread2.resourceB = resourceB;
        thread1.start();
        thread2.start();

    }

}

class DeadLockResourceA {
    
    DeadLockResourceB resourceB;
    public synchronized int getI() {
        return resourceB.returnI();
    }
    
    public synchronized int returnI() {
        return 1;
    }

}

class DeadLockResourceB {
    
    DeadLockResourceA resourceA;
    public synchronized int getI() {
        return resourceA.returnI();
    }
    
    public synchronized int returnI() {
        return 2;
    }

}

class DeadLockThread1 extends Thread{
    
    DeadLockResourceA resourceA;
    
    @Override 
    public void run() {
        System.out.println(resourceA.getI());
    }

}

class DeadLockThread2 extends Thread{
    
    DeadLockResourceB resourceB;
    
    @Override 
    public void run() {
        System.out.println(resourceB.getI());
    }

}

