package Multithreading;

import java.util.concurrent.Exchanger;

public class ExchangerExample {

    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        
        new Mike(exchanger);
        new Anket(exchanger);
    }

    static class Mike extends Thread {
        Exchanger<String> exchanger;

        public Mike(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }
        
        @Override
        public void run() {
            try {
                exchanger.exchange("I'm 20 years old");
                sleep(3000);
                exchanger.exchange("Hi my name is Mike");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    static class Anket extends Thread {
        
        Exchanger<String> exchanger;

        public Anket(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }
        
        @Override
        public void run() {
            try {
                System.out.println(exchanger.exchange(null));
                System.out.println(exchanger.exchange(null));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
           }
        }
        
    }
}
