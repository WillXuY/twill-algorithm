package leetcode.p1100_1199.p1114_print_in_order;

import org.junit.jupiter.api.Test;

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
