package org.willxu.algorithm.domain.tree;

/**
 * A trie (pronounced as "try") or prefix tree is a tree data structure
 * used to efficiently store and retrieve keys in a dataset of strings.
 * There are various applications of this data structure, such as
 * autocomplete and spellchecker.
 */
public interface ImplementTriePrefixTree {
    /**
     * Inserts the string word into the trie.
     *
     * @param word 1 <= word.length <= 2000
     *             consist only of lowercase English letters.
     */
    void insert(String word);

    /**
     * @param word 1 <= word.length <= 2000
     *             consist only of lowercase English letters.
     * @return true if the string word is in the trie (i.e., was
     *         inserted before), and false otherwise.
     */
    boolean search(String word);

    /**
     * @param prefix 1 <= prefix.length <= 2000
     *          consist only of lowercase English letters.
     * @return true if there is a previously inserted string word that
     *         has the prefix prefix, and false otherwise.
     */
    boolean startsWith(String prefix);
}
