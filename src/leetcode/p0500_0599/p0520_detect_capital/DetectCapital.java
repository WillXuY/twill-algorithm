package leetcode.p0500_0599.p0520_detect_capital;

public interface DetectCapital {
    /**
     * We define the usage of capitals in a word to be right when one of
     * the following cases holds:
     * - All letters in this word are capitals, like "USA".
     * - All letters in this word are not capitals, like "leetcode".
     * - Only the first letter in this word is capital, like "Google".
     * Given a string word, return true if the usage of capitals in it
     * is right.
     *
     * @param word 1 <= word.length <= 100
     *             consists of lowercase and uppercase English letters.
     * @return is detect capital usage.
     */
    boolean detectCapitalUse(String word);
}
