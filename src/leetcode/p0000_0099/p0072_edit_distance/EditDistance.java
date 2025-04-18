package leetcode.p0000_0099.p0072_edit_distance;

public interface EditDistance {
    /**
     * Given two strings word1 and word2, return the minimum number of
     * operations required to convert word1 to word2.
     * <p>
     * You have the following three operations permitted on a word:
     * <p>
     * - Insert a character
     * - Delete a character
     * - Replace a character
     *
     * @param word1,word2 0 <= word1.length, word2.length <= 500
     *                    consist of lowercase English letters.
     */
    int minDistance(String word1, String word2);
}
