package org.willxu.algorithm.service.strs;

public interface OccurrencesAfterBigram {
    /**
     * Given two strings first and second, consider occurrences in some
     * text of the form "first second third", where second comes
     * immediately after first, and third comes immediately after
     * second.
     * Return an array of all the words third for each occurrence of
     * "first second third".
     *
     * @param text 1 <= text.length <= 1000
     *             consists of lowercase English letters and spaces.
     *             All the words in text a separated by a single space.
     * @param first 1 <= first.length <= 10
     *              consist of lowercase English letters.
     * @param second 1 <= second.length <= 10
     *              consist of lowercase English letters.
     * @return the third word after first and second words.
     */
    String[] findOcurrences(String text, String first, String second);
}
