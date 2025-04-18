package leetcode.p0500_0599.p0521_longest_uncommon_subsequence1;

public interface LongestUncommonSubsequence1 {
    /**
     * Given two strings a and b, return the length of the longest
     * uncommon subsequence between a and b. If the longest uncommon
     * subsequence does not exist, return -1.
     * An uncommon subsequence between two strings is a string that is a
     * subsequence of one but not the other.
     * A subsequence of a string s is a string that can be obtained
     * after deleting any number of characters from s.
     * - For example, "abc" is a subsequence of "aebdc" because you can
     *   delete the underlined characters (e,d) in "aebdc" to get "abc".
     *   Other subsequences of "aebdc" include "aebdc", "aeb",
     *   and ""(empty string).
     *
     * @param a 1 <= a.length <= 100
     *          consist of lower-case English letters.
     * @param b 1 <= b.length <= 100
     *          consist of lower-case English letters.
     * @return the longest uncommon subsequence.
     */
    int findLUSlength(String a, String b);
}
