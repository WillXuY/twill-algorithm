package org.willxu.algorithm.service.bool;

public interface PalindromeNumber {
    /**
     * Given an integer x, return true if x is palindrome integer.
     * An integer is a palindrome when it reads the same backward as forward.
     * For example, 121 is palindrome while 123 is not.
     * @param x -2^31 <= x <= 2^31 - 1
     * @return check palindrome integer
     */
    boolean isPalindrome(int x);
}
