package leetcode.p0500_0599.p0541_reverse_string_ii;

public interface ReverseStringIi {
    /**
     * Given a string s and an integer k, reverse the first k characters
     * for every 2k characters counting from the start of the string.
     * If there are fewer than k characters left, revers all of them. If
     * There are less than 2k but greater than or equal to k characters,
     * then reverse the first k characters and left the other as
     * original.
     *
     * @param s 1 <= s.length <= 10^4
     *          consists of only lowercase English letters.
     * @param k 1 <= k <= 10^4
     * @return reverse k letters and skip k letters and so on.
     */
    String reverseStr(String s, int k);
}
