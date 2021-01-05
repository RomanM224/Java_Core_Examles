package MathRandom;

import java.util.Random;

public class RamdomExample {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("random.nextBoolean() - " + random.nextBoolean());
        System.out.println("random.nextDouble() - " + random.nextDouble());
        System.out.println("random.nextInt() - " + random.nextInt());
    }

}
