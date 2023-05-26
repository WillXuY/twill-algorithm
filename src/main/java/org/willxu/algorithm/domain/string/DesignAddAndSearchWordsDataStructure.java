package org.willxu.algorithm.domain.string;

/**
 * Design a data structure that supports adding new words and finding if
 * a string matches any previously added string.
 * <p>
 * Implement the WordDictionary class:
 */
public interface DesignAddAndSearchWordsDataStructure {
    /**
     * Adds word to the data structure, it can be matched later.
     * @param word 1 <= word.length <= 25
     *             word in addWord consists of lowercase English letters.
     */
    void addWord(String word);

    /**
     * @param word 1 <= word.length <= 25
     *             consist of '.' or lowercase English letters.
     *             There will be at most 2 dots in word for search
     *             queries.
     * @return true if there is any string in the data structure that
     *         matches word or false otherwise. word may contain dots
     *         '.' where dots can be matched with any letter.
     */
    boolean search(String word);
}
