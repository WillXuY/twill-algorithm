package org.willxu.algorithm.domain.thread;

public abstract class AbstractPrintInOrder {
    public static class PrintThread implements Runnable {
        String info;

        @Override
        public void run() {
            System.out.print(info);
        }
    }

    public PrintThread getPrintThread(String info) {
        PrintThread printThread = new PrintThread();
        printThread.info = info;
        return printThread;
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
