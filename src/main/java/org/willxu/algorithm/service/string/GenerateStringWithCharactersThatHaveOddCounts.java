package org.willxu.algorithm.service.string;

public interface GenerateStringWithCharactersThatHaveOddCounts {
    /**
     * Given an integer n, return a string with n characters such that
     * each character in such string occurs an odd number of times.
     * The returned string must contain only lowercase English letters.
     * If there are multiples valid strings, return any of them.
     *
     * @param n 1 <= n <= 500
     * @return generate the string with n characters.
     */
    String generateTheString(int n);
}
