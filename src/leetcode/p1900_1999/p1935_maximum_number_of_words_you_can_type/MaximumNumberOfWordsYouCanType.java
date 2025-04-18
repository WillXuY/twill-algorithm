package leetcode.p1900_1999.p1935_maximum_number_of_words_you_can_type;

public interface MaximumNumberOfWordsYouCanType {
    /**
     * There is a malfunctioning keyboard where some letter keys do not
     * work. All other keys on the keyboard work properly.
     *
     * Given a string text of words separated by a single space (no
     * leading or trailing spaces) and a string brokenLetters of all
     * distinct letter keys that are broken, return the number of words
     * in text you can fully type using this keyboard.
     *
     * @param text 1 <= text.length <= 104
     *             consists of words separated by a single space without
     *             any leading or trailing spaces.
     *             Each word only consists of lowercase English letters.
     * @param brokenLetters 0 <= brokenLetters.length <= 26
     *                      consists of distinct lowercase English
     *                      letters.
     */
    int canBeTypedWords(String text, String brokenLetters);
}
