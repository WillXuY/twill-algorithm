package org.willxu.algorithm.service.impl.int2bool;

import org.willxu.algorithm.service.int2bool.PalindromeNumber;

public class PalindromeNumberBruteForce implements PalindromeNumber {
    @Override
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x == 0) {
            return true;
        }
        // reverse
        int reverse = x % 10;
        int quotient = x / 10;
        while (quotient > 0) {
            reverse *= 10;
            reverse += quotient % 10;
            quotient /= 10;
        }
        return reverse == x;
    }
}
