package leetcode.p1800_1899.p1869_longer_contiguous_segments_of_ones_than_zeros;

public interface LongerContiguousSegmentsOfOnesThanZeros {
    /**
     * Given a binary string s, return true if the longest contiguous
     * segment of 1's is strictly longer than the longest contiguous
     * segment of 0's in s, or return false otherwise.
     *
     * - For example, in s = "110100010" the longest continuous segment
     *   of 1s has length 2, and the longest continuous segment of 0s
     *   has length 3.
     *
     * Note that if there are no 0's, then the longest continuous
     * segment of 0's is considered to have a length 0. The same applies
     * if there is no 1's.
     *
     * @param s 1 <= s.length <= 100
     *          s[i] is either '0' or '1'.
     */
    boolean checkZeroOnes(String s);
}
