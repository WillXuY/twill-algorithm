package org.willxu.algorithm.service.integer;

public interface NumberOfSubstringsContainingAllThreeCharacters {
    /**
     * Given a string s consisting only of characters a, b and c.
     * <p>
     * Return the number of substrings containing at least one
     * occurrence of all these characters a, b and c.
     *
     * @param s 3 <= s.length <= 5 x 10^4
     *          only consists of a, b or c characters.
     */
    int numberOfSubstrings(String s);
}
