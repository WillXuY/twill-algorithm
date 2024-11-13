package org.willxu.algorithm.service.strlist;

import java.util.List;

public interface PrintWordsVertically {
    /**
     * Given a string s. Return all the words vertically in the same
     * order in which they appear in s.
     * <p>
     * Words are returned as a list of strings, complete with spaces
     * when is necessary. (Trailing spaces are not allowed).
     * <p>
     * Each word would be put on only one column and that in one column
     * there will be only one word.
     *
     * @param s 1 <= s.length <= 200
     *          contains only upper case English letters.
     *          It's guaranteed that there is only one space between
     *          2 words.
     */
    List<String> printVertically(String s);
}
