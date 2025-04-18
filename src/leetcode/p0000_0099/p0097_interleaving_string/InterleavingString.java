package leetcode.p0000_0099.p0097_interleaving_string;

public interface InterleavingString {
    /**
     * Given strings s1, s2, and s3, find whether s3 is formed by an
     * interleaving of s1 and s2.
     * <p>
     * An interleaving of two strings s and t is a configuration where s
     * and t are divided into n and m substrings respectively, such that:
     * <p>
     * - s = s1 + s2 + ... + sn
     * - t = t1 + t2 + ... + tm
     * - |n - m| <= 1
     * - The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or
     *   t1 + s1 + t2 + s2 + t3 + s3 + ...
     * <p>
     * Note: a + b is the concatenation of strings a and b.
     *
     * @param s1,s2 0 <= s1.length, s2.length <= 100
     *              consist of lowercase English letters.
     * @param s3 0 <= s3.length <= 200
     *           consist of lowercase English letters.
     */
    boolean isInterleave(String s1, String s2, String s3);
}
