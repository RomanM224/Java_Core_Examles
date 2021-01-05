package Multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChickenVoice {

    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        EggVoice eggVoice = new EggVoice();
        System.out.println("Start controversy");
        eggVoice.start();

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("Chicken");
        }

        if (eggVoice.isAlive()) {
            try {
                eggVoice.join();
            } catch (InterruptedException e) {
            }
            System.out.println("First appeared egg");
        } else {
            System.out.println("First appeared chicken");
        }
        System.out.println("Controversy stopt");

    }

}

class EggVoice extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("Egg");
        }
    }

}
