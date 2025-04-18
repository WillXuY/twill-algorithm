package org.willxu.algorithm.service.integer;

public interface SumOfDigitsOfStringAfterConvert {
    /**
     * You are given a string s consisting of lowercase English letters,
     * and an integer k.
     * <p>
     * First, convert s into an integer by replacing each letter with
     * its position in the alphabet (i.e., replace 'a' with 1, 'b' with
     * 2, ..., 'z' with 26). Then, transform the integer by replacing it
     * with the sum of its digits. Repeat the transform operation k
     * times in total.
     * <p>
     * For example, if s = "zbax" and k = 2, then the resulting integer
     * would be 8 by the following operations:
     * <p>
     * - Convert: "zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124
     * - Transform #1: 262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17
     * - Transform #2: 17 ➝ 1 + 7 ➝ 8
     * <p>
     * Return the resulting integer after performing the operations
     * described above.
     *
     * @param s 1 <= s.length <= 100
     *          consists of lowercase English letters.
     * @param k 1 <= k <= 10
     */
    int getLucky(String s, int k);
}
