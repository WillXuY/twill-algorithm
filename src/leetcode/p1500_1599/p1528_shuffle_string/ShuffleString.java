package leetcode.p1500_1599.p1528_shuffle_string;

public interface ShuffleString {
    /**
     * You are given a string s and an integer array indices of the same
     * length. The string s will be shuffled such that the character at
     * the ith position moves to indices[i] in the shuffled string.
     *
     * Return the shuffled string.
     *
     * @param s s.length == indices.length == n
     *          1 <= n <= 100
     *          s consists of only lowercase English letters.
     * @param indices 0 <= indices[i] < n
     *                All values of indices are unique.
     */
    String restoreString(String s, int[] indices);
}
