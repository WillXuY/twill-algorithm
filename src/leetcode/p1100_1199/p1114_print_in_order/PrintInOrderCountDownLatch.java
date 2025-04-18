package org.willxu.algorithm.domain.impl.thread;

import leetcode.p1100_1199.p1114_print_in_order.AbstractPrintInOrder;

import java.util.concurrent.CountDownLatch;

public class PrintInOrderCountDownLatch extends AbstractPrintInOrder {
    private final CountDownLatch countDownLatch1;

    private final CountDownLatch countDownLatch2;

    public PrintInOrderCountDownLatch() {
        countDownLatch1 = new CountDownLatch(1);
        countDownLatch2 = new CountDownLatch(1);
    }

    @Override
    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        countDownLatch1.countDown();
    }

    @Override
    public void second(Runnable printSecond) throws InterruptedException {
        countDownLatch1.await();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        countDownLatch2.countDown();
    }

    @Override
    public void third(Runnable printThird) throws InterruptedException {
        countDownLatch2.await();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
