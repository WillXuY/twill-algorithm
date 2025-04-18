package org.willxu.algorithm.service.character;

public interface FirstLetterToAppearTwice {
    /**
     * Given a string s consisting of lowercase English letters, return
     * the first letter to appear twice.
     *
     * Note:
     *
     * - A letter a appears twice before another letter b if the second
     *   occurrence of a is before the second occurrence of b.
     * - s will contain at least one letter that appears twice.
     *
     * @param s 2 <= s.length <= 100
     *          consists of lowercase English letters.
     *          has at least one repeated letter.
     */
    char repeatedCharacter(String s);
}
