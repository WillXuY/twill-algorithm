package leetcode.p2000_2099.p2047_number_of_valid_words_in_sentence;

public interface NumberOfValidWordsInSentence {
    /**
     * A sentence consists of lowercase letters ('a' to 'z'), digits
     * ('0' to '9'), hyphens ('-'), punctuation marks ('!', '.',
     * and ','), and spaces (' ') only. Each sentence can be broken down
     * into one or more tokens separated by one or more spaces ' '.
     * <p>
     * A token is a valid word if all three of the following are true:
     * <p>
     * - It only contains lowercase letters, hyphens, and/or punctuation
     *   (no digits).
     * - There is at most one hyphen '-'. If present, it must be
     *   surrounded by lowercase characters ("a-b" is valid, but "-ab"
     *   and "ab-" are not valid).
     * - There is at most one punctuation mark. If present, it must be
     *   at the end of the token ("ab,", "cd!", and "." are valid, but
     *   "a!b" and "c.," are not valid).
     * <p>
     * Examples of valid words include "a-b.", "afad", "ba-c", "a!",
     * and "!".
     * <p>
     * Given a string sentence, return the number of valid words in
     * sentence.
     *
     * @param sentence 1 <= sentence.length <= 1000
     *                 sentence only contains lowercase English letters,
     *                 digits, ' ', '-', '!', '.', and ','.
     *                 There will be at least 1 token.
     */
    int countValidWords(String sentence);
}
