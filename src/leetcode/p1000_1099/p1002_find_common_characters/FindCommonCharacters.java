package org.willxu.algorithm.service.strlist;

import java.util.List;

public interface FindCommonCharacters {
    /**
     * Given a string array words, return an array of all characters
     * that show up in all strings within the words (including
     * duplicates). You may return the answer in any order.
     *
     * @param words 1 <= words.length <= 100
     *              1 <= words[i].length <= 100
     *              consists of lowercase English letters.
     * @return common chars in all words.
     */
    List<String> commonChars(String[] words);
}
