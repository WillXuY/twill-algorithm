package leetcode.p0500_0599.p0509_fibonacci_number;

public interface FibonacciNumber {
    /**
     * The Fibonacci numbers, commonly denoted F(n) form a sequence,
     * called the Fibonacci sequence, such that each number is the sum
     * of the two preceding ones, starting from 0 and 1. That is,
     *   F(0) = 0, F(1) = 1
     *   F(n) = F(n - 1) + F(n - 2), for n > 1.
     * Given n, calculate F(n).
     *
     * @param n 0 <= n <= 30
     * @return the n-th Fibonacci number.
     */
    int fib(int n);
}
