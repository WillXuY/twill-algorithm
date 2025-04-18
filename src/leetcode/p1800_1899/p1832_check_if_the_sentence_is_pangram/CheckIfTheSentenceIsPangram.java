package leetcode.p1800_1899.p1832_check_if_the_sentence_is_pangram;

public interface CheckIfTheSentenceIsPangram {
    /**
     * A pangram is a sentence where every letter of the English
     * alphabet appears at least once.
     *
     * Given a string sentence containing only lowercase English
     * letters, return true if sentence is a pangram, or false
     * otherwise.
     *
     * @param sentence 1 <= sentence.length <= 1000
     *                 sentence consists of lowercase English letters.
     */
    boolean checkIfPangram(String sentence);
}
