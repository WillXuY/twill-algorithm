package org.willxu.algorithm.service.string;

public interface DeleteCharactersToMakeFancyString {
    /**
     * A fancy string is a string where no three consecutive characters
     * are equal.
     * <p>
     * Given a string s, delete the minimum possible number of
     * characters from s to make it fancy.
     * <p>
     * Return the final string after the deletion. It can be shown that
     * the answer will always be unique.
     *
     * @param s  1 <= s.length <= 105
     *           s consists only of lowercase English letters.
     */
    String makeFancyString(String s);
}
