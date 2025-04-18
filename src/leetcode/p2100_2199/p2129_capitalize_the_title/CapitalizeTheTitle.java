package org.willxu.algorithm.service.string;

public interface CapitalizeTheTitle {
    /**
     * You are given a string title consisting of one or more words
     * separated by a single space, where each word consists of English
     * letters. Capitalize the string by changing the capitalization of
     * each word such that:
     * <p>
     * - If the length of the word is 1 or 2 letters, change all letters
     *   to lowercase.
     * - Otherwise, change the first letter to uppercase and the
     *   remaining letters to lowercase.
     * <p>
     * Return the capitalized title.
     *
     * @param title 1 <= title.length <= 100
     *              consists of words separated by a single space
     *              without any leading or trailing spaces.
     *              Each word consists of uppercase and lowercase
     *              English letters and is non-empty.
     */
    String capitalizeTitle(String title);
}
