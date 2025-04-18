package leetcode.p2100_2199.p2138_divide_string_into_groups_of_size;

public interface DivideStringIntoGroupsOfSize {
    /**
     * A string s can be partitioned into groups of size k using the
     * following procedure:
     * <p>
     * - The first group consists of the first k characters of the
     *   string, the second group consists of the next k characters of
     *   the string, and so on. Each character can be a part of exactly
     *   one group.
     * - For the last group, if the string does not have k characters
     *   remaining, a character fill is used to complete the group.
     * <p>
     * Note that the partition is done so that after removing the fill
     * character from the last group (if it exists) and concatenating
     * all the groups in order, the resultant string should be s.
     * <p>
     * Given the string s, the size of each group k and the character
     * fill, return a string array denoting the composition of every
     * group s has been divided into, using the above procedure.
     *
     * @param s 1 <= s.length <= 100
     *          consists of lowercase English letters only.
     * @param k 1 <= k <= 100
     * @param fill is a lowercase English letter.
     */
    String[] divideString(String s, int k, char fill);
}
