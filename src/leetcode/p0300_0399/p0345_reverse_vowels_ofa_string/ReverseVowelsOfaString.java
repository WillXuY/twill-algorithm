package org.willxu.algorithm.service.string;

public interface ReverseVowelsOfaString {
    /**
     * Given a string s, reverse only all the vowels in the string and
     * return it.
     * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear
     * in both cases.
     *
     * @param s 1 <= s.length <= 3 * 10^5
     *          s consist of printable ASCII characters.
     * @return reverse vowels string.
     */
    String reverseVowels(String s);
}
