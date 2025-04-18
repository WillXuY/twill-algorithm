package org.willxu.algorithm.service.string;

public interface GreatestEnglishLetterInUpperAndLowerCase {
    /**
     * Given a string of English letters s, return the greatest English
     * letter which occurs as both a lowercase and uppercase letter in
     * s. The returned letter should be in uppercase. If no such letter
     * exists, return an empty string.
     * <p>
     * An English letter b is greater than another letter a if b appears
     * after a in the English alphabet.
     *
     * @param s 1 <= s.length <= 1000
     *          consists of lowercase and uppercase English letters.
     */
    String greatestLetter(String s);
}
