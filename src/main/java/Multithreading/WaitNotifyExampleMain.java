package Multithreading;

import java.util.concurrent.ThreadLocalRandom;

public class WaitNotifyExampleMain {

    public static void main(String[] args) {
        WaitNotifyExampleData data = new WaitNotifyExampleData();
        Thread sender = new Thread(new WaitNotifyExampleSender(data));
        Thread receiver = new Thread(new WaitNotifyExampleReceiver(data));

        sender.start();
        receiver.start();
    }
}

class WaitNotifyExampleData {

    private String packet;

    private boolean transfer = true;

    public void send(String packet) {
        synchronized (this) {
            while (!transfer) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            transfer = false;
            
            this.packet = packet;
            notifyAll();
        }
    }

    public synchronized String receive() {
        while (transfer) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        transfer = true;

        notifyAll();
        return packet;
    }
}

class WaitNotifyExampleReceiver implements Runnable{     
    private WaitNotifyExampleData load;
  
    public WaitNotifyExampleReceiver(WaitNotifyExampleData load) {
        this.load = load;
    }

    public void run() {
        for(String receivedMessage = load.receive();
          !"End".equals(receivedMessage);
          receivedMessage = load.receive()) {
             
            System.out.println(receivedMessage);

            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
            }
        }
    }
}

class WaitNotifyExampleSender implements Runnable{
    
    private WaitNotifyExampleData data;
    
    public WaitNotifyExampleSender(WaitNotifyExampleData data) {
        super();
        this.data = data;
    }
  
    public void run() {
        String packets[] = {
          "First packet",
          "Second packet",
          "Third packet",
          "Fourth packet",
          "End"
        };
        for (String packet : packets) {
            data.send(packet);
            // Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt(); 
            }
        }
    }
}