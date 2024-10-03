package org.willxu.algorithm.service.string;

public interface RemoveAllAdjacentDuplicatesInStringIi {
    /**
     * You are given a string s and an integer k, a k duplicate removal
     * consists of choosing k adjacent and equal letters from s and
     * removing them, causing the left and the right side of the deleted
     * substring to concatenate together.
     * <p>
     * We repeatedly make k duplicate removals on s until we no longer
     * can.
     * <p>
     * Return the final string after all such duplicate removals have
     * been made. It is guaranteed that the answer is unique.
     *
     * @param s 1 <= s.length <= 10^5
     *          only contains lowercase English letters.
     * @param k 2 <= k <= 10^4
     */
    String removeDuplicates(String s, int k);
}
