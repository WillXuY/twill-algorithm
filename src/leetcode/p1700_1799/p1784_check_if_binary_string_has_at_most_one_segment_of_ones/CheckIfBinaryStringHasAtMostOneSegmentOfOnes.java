package leetcode.p1700_1799.p1784_check_if_binary_string_has_at_most_one_segment_of_ones;

public interface CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
    /**
     * Given a binary string s without leading zeros, return true if s
     * contains at most one contiguous segment of ones. Otherwise,
     * return false.
     *
     * @param s 1 <= s.length <= 100
     *          s[i] is either '0' or '1'.
     *          s[0] is '1'.
     */
    boolean checkOnesSegment(String s);
}
