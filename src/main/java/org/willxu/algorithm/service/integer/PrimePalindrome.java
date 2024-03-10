package org.willxu.algorithm.service.integer;

public interface PrimePalindrome {
    /**
     * Given an integer n, return the smallest prime palindrome greater
     * than or equal to n.
     * <p>
     * An integer is prime if it has exactly two divisors: 1 and itself.
     * Note that 1 is not a prime number.
     * <p>
     * - For example, 2, 3, 5, 7, 11, and 13 are all primes.
     * <p>
     * An integer is a palindrome if it reads the same from left to
     * right as it does from right to left.
     * <p>
     * - For example, 101 and 12321 are palindromes.
     * <p>
     * The test cases are generated so that the answer always exists and
     * is in the range [2, 2 * 10^8].
     *
     * @param n 1 <= n <= 10^8
     */
    int primePalindrome(int n);
}
