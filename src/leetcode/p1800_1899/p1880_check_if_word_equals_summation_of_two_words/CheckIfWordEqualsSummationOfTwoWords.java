package leetcode.p1800_1899.p1880_check_if_word_equals_summation_of_two_words;

public interface CheckIfWordEqualsSummationOfTwoWords {
    /**
     * The letter value of a letter is its position in the alphabet
     * starting from 0 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, etc.).
     *
     * The numerical value of some string of lowercase English letters s
     * is the concatenation of the letter values of each letter in s,
     * which is then converted into an integer.
     *
     * - For example, if s = "acb", we concatenate each letter's letter
     * value, resulting in "021". After converting it, we get 21.
     *
     * You are given three strings firstWord, secondWord, and
     * targetWord, each consisting of lowercase English letters 'a'
     * through 'j' inclusive.
     *
     * Return true if the summation of the numerical values of firstWord
     * and secondWord equals the numerical value of targetWord, or false
     * otherwise.
     *
     * @param firstWord, secondWord, targetWord 1 <= length <= 8
     *   consist of lowercase English letters from 'a' to 'j' inclusive.
     */
    boolean isSumEqual(String firstWord, String secondWord, String targetWord);
}
