package Multithreading;

public class Incremenator extends Thread {

    private volatile boolean mIsIncrement = true;

    public void changeAction() {
        mIsIncrement = !mIsIncrement; // Меняет действие на противоположное
    }

    @Override
    public void run() {
        do {
            if (!Thread.interrupted()) { // Проверка прерывания
                if (mIsIncrement) {
                    Program.mValue++; // Инкремент
                } else {
                    Program.mValue--; // Декремент
                }
                System.out.println(Program.mValue + " ");
            } else {
                return; // Завершение потока
            }
            try {
                Thread.sleep(1000); // Приостановка потока на 1 sec
            } catch (InterruptedException e) {
                return; // Завершение потока после прерывания
            }
        } while (true);
    }

}
