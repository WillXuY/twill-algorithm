package org.willxu.algorithm.service.string;

import java.util.function.IntConsumer;

/**
 * You have a function printNumber that can be called with an integer
 * parameter and prints it to the console.
 * <p>
 * For example, calling printNumber(7) prints 7 to the console.
 * <p>
 * You are given an instance of the class ZeroEvenOdd that has three
 * functions: zero, even, and odd. The same instance of ZeroEvenOdd
 * will be passed to three different threads:
 * <p>
 * - Thread A: calls zero() that should only output 0's.
 * - Thread B: calls even() that should only output even numbers.
 * - Thread C: calls odd() that should only output odd numbers.
 * <p>
 * Modify the given class to output the series "010203040506..." where
 * the length of the series must be 2n.
 * <p>
 * Implement the ZeroEvenOdd class:
 * <p>
 * - ZeroEvenOdd(int n) Initializes the object with the number n that
 *   represents the numbers that should be printed.
 * - void zero(printNumber) Calls printNumber to output one zero.
 * - void even(printNumber) Calls printNumber to output one even number.
 * - void odd(printNumber) Calls printNumber to output one odd number.
 *
 */
public abstract class PrintZeroEvenOdd {
    private int n;

    public PrintZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {

    }

    public void even(IntConsumer printNumber) throws InterruptedException {

    }

    public void odd(IntConsumer printNumber) throws InterruptedException {

    }
}
