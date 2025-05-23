package leetcode.p2400_2499.p2451_odd_string_difference;

public interface OddStringDifference {
    /**
     * You are given an array of equal-length strings words. Assume that
     * the length of each string is n.
     * <p>
     * Each string words[i] can be converted into a difference integer
     * array difference[i] of length n - 1 where difference[i][j] =
     * words[i][j+1] - words[i][j] where 0 <= j <= n - 2. Note that the
     * difference between two letters is the difference between their
     * positions in the alphabet i.e. the position of 'a' is 0, 'b' is
     * 1, and 'z' is 25.
     * <p>
     * - For example, for the string "acb", the difference integer array
     *   is [2 - 0, 1 - 2] = [2, -1].
     * <p>
     * All the strings in words have the same difference integer array,
     * except one. You should find that string.
     * <p>
     * Return the string in words that has different difference integer
     * array.
     *
     * @param words 3 <= words.length <= 100
     *              n == words[i].length
     *              2 <= n <= 20
     *              words[i] consists of lowercase English letters.
     */
    String oddString(String[] words);
}
