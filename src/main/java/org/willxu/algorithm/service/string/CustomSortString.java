package org.willxu.algorithm.service.string;

public interface CustomSortString {
    /**
     * You are given two strings order and s. All the characters of
     * order are unique and were sorted in some custom order previously.
     * <p>
     * Permute the characters of s so that they match the order that
     * order was sorted. More specifically, if a character x occurs
     * before a character y in order, then x should occur before y in
     * the permuted string.
     * <p>
     * Return any permutation of s that satisfies this property.
     *
     * @param order 1 <= order.length <= 26
     * @param s 1 <= s.length <= 200
     *          order and s consist of lowercase English letters.
     *          All the characters of order are unique.
     */
    String customSortString(String order, String s);
}
