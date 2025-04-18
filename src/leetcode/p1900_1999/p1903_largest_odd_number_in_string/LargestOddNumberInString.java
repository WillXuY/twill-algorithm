package leetcode.p1900_1999.p1903_largest_odd_number_in_string;

public interface LargestOddNumberInString {
    /**
     * You are given a string num, representing a large integer. Return
     * the largest-valued odd integer (as a string) that is a non-empty
     * substring of num, or an empty string "" if no odd integer exists.
     * <p>
     * A substring is a contiguous sequence of characters within a
     * string.
     *
     * @param num 1 <= num.length <= 105
     *           enum only consists of digits and does not contain any
     *           leading zeros.
     */
    String largestOddNumber(String num);
}
