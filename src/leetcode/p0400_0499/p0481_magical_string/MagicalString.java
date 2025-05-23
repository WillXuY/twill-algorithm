package leetcode.p0400_0499.p0481_magical_string;

public interface MagicalString {
    /**
     * A magical string s consists of only '1' and '2' and obeys the
     * following rules:
     * <p>
     * - The string s is magical because concatenating the number of
     *   contiguous occurrences of characters '1' and '2' generates the
     *   string s itself.
     * <p>
     * The first few elements of s is s = "1221121221221121122……". If we
     * group the consecutive 1's and 2's in s, it will be
     * "1 22 11 2 1 22 1 22 11 2 11 22 ......" and the occurrences of
     * 1's or 2's in each group are "1 2 2 1 1 2 1 2 2 1 2 2 ......".
     * You can see that the occurrence sequence is s itself.
     * <p>
     * Given an integer n, return the number of 1's in the first n
     * number in the magical string s.
     * <p>
     * 1 22 11  2  1  22 1 22 11
     * 1  2  2  1  1  2  1 2  2
     *
     * @param n 1 <= n <= 10^5
     */
    int magicalString(int n);
}
