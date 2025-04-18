package leetcode.p1700_1799.p1758_minimum_changes_to_make_alternating_binary_string;

public interface MinimumChangesToMakeAlternatingBinaryString {
    /**
     * You are given a string s consisting only of the characters '0'
     * and '1'. In one operation, you can change any '0' to '1' or vice
     * versa.
     *
     * The string is called alternating if no two adjacent characters
     * are equal. For example, the string "010" is alternating, while
     * the string "0100" is not.
     *
     * Return the minimum number of operations needed to make s
     * alternating.
     *
     * @param s 1 <= s.length <= 104
     *          s[i] is either '0' or '1'.
     */
    int minOperations(String s);
}
