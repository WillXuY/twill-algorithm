package org.willxu.algorithm.domain.thread;

import org.junit.jupiter.api.Test;
import org.willxu.algorithm.domain.impl.thread.PrintInOrderCountDownLatch;

public class PrintInOrderTest {
    /**
     * todo what is leetcode's test code?
     */
    @Test
    public void testSleep() {
        AbstractPrintInOrder sleep = new PrintInOrderCountDownLatch();
        System.out.println("1, 2, 3");
        new Thread(() -> {
            try {
                sleep.first(sleep.getPrintThread("first"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                sleep.second(sleep.getPrintThread("second"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                sleep.third(sleep.getPrintThread("third"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        System.out.println("\n1, 3, 2");
        new Thread(() -> {
            try {
                sleep.first(sleep.getPrintThread("first"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                sleep.third(sleep.getPrintThread("third"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                sleep.second(sleep.getPrintThread("second"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
