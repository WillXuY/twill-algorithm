package org.willxu.algorithm.domain.other;

/**
 * Design a data structure that is initialized with a list of different
 * words. Provided a string, you should determine if you can change
 * exactly one character in this string to match any word in the data
 * structure.
 * <p>
 * Implement the MagicDictionary class:
 * <p>
 * MagicDictionary() Initializes the object.
 * <p>
 * - buildDict will be called only once before search.
 * - At most 100 calls will be made to search.
 */
public interface ImplementMagicDictionary {
    /**
     * Sets the data structure with an array of distinct strings
     * dictionary.
     *
     * @param dictionary 1 <= dictionary.length <= 100
     *                   1 <= dictionary[i].length <= 100
     *                   dictionary[i] consists of only lower-case
     *                   English letters.
     *                   All the strings in dictionary are distinct.
     */
    void buildDict(String[] dictionary);

    /**
     * @param searchWord 1 <= searchWord.length <= 100
     *                   consists of only lower-case English letters.
     * @return true if you can change exactly one character in
     *         searchWord to match any string in the data structure,
     *         otherwise returns false.
     */
    boolean search(String searchWord);
}
