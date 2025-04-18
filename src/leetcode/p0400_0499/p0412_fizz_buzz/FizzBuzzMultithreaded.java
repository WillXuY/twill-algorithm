package leetcode.p0400_0499.p0412_fizz_buzz;

import java.util.function.IntConsumer;

/**
 * You are given an instance of the class FizzBuzz that has four
 * functions: fizz, buzz, fizzbuzz and number. The same instance of
 * FizzBuzz will be passed to four different threads:
 * <p>
 * - Thread A: calls fizz() that should output the word "fizz".
 * - Thread B: calls buzz() that should output the word "buzz".
 * - Thread C: calls fizzbuzz() that should output the word "fizzbuzz".
 * - Thread D: calls number() that should only output the integers.
 * <p>
 * Modify the given class to output the series
 * [1, 2, "fizz", 4, "buzz", ...] where the ith token (1-indexed) of the
 * series is:
 * <p>
 * - "fizzbuzz" if i is divisible by 3 and 5,
 * - "fizz" if i is divisible by 3 and not 5,
 * - "buzz" if i is divisible by 5 and not 3, or
 * - i if i is not divisible by 3 or 5.
 * <p>
 * Implement the FizzBuzz class:
 */
public abstract class FizzBuzzMultithreaded {
    private int n;

    public FizzBuzzMultithreaded(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    abstract void fizz(Runnable printFizz) throws InterruptedException;

    // printBuzz.run() outputs "buzz".
    abstract void buzz(Runnable printBuzz) throws InterruptedException;

    // printFizzBuzz.run() outputs "fizzbuzz".
    abstract void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException;

    // printNumber.accept(x) outputs "x", where x is an integer.
    abstract void number(IntConsumer printNumber) throws InterruptedException;
}
