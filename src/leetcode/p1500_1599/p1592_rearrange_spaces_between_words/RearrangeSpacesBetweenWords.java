package leetcode.p1500_1599.p1592_rearrange_spaces_between_words;

public interface RearrangeSpacesBetweenWords {
    /**
     * You are given a string text of words that are placed among some
     * number of spaces. Each word consists of one or more lowercase
     * English letters and are separated by at least one space. It's
     * guaranteed that text contains at least one word.
     *
     * Rearrange the spaces so that there is an equal number of spaces
     * between every pair of adjacent words and that number is
     * maximized. If you cannot redistribute all the spaces equally,
     * place the extra spaces at the end, meaning the returned string
     * should be the same length as text.
     *
     * Return the string after rearranging the spaces.
     *
     * @param text 1 <= text.length <= 100
     *             text consists of lowercase English letters and ' '.
     *             text contains at least one word.
     */
    String reorderSpaces(String text);
}
