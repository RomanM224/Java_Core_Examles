package Multithreading;

public class Program {
    
    public static int mValue = 0;
    
    public static void main(String[] args) {
//        SomeThing mThing = mThing = new SomeThing();          //How create thread with implementing interface Runnable 1#
//        Thread myThread = new Thread(mThing);
//        myThread.start();
//        
//        System.out.println("Main thread finished");

//        Thread myThread = new Thread(new Runnable() {          //How create thread with implementing interface Runnable 2#
//            @Override
//            public void run() {
//                System.out.println("Hello from side thread");
//            }
//        });
//        myThread.start();
//        System.out.println("Main thread finished");
        
        
//        AffableThread mThread = new AffableThread();            //How create thread with extends class Thread 3#
//        mThread.start();
//        
//        System.out.println("Main thread finished");
        
         Incremenator mInc = new Incremenator();                 //Create Incrementator
         System.out.println("Value = ");
         mInc.start();
         for(int i = 1; i <=3; i++) {
             try {
                Thread.sleep(i*2*1000);
            } catch (InterruptedException e) {}
             mInc.changeAction();
         }
         mInc.interrupt();
    }
}

class AffableThread extends Thread {
    
    @Override
    public void run() {
        System.out.println("Hello from side thread");
    }

}

class SomeThing implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello from side thread");
        int c = 5;

    }
}
