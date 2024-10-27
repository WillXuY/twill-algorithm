package org.willxu.algorithm.domain.string;

/**
 * Design the CombinationIterator class:
 * <p>
 */
public abstract class IteratorForCombination {
    /**
     * Initializes the object with a string characters of sorted
     * distinct lowercase English letters and a number
     * combinationLength as arguments.
     *
     * @param characters,combinationLength
     *        1 <= combinationLength <= characters.length <= 15
     *        All the characters of characters are unique.
     *        At most 10^4 calls will be made to next and hasNext.
     *        It is guaranteed that all calls of the function next are
     *        valid.
     */
    public IteratorForCombination(String characters, int combinationLength) {}

    /**
     * @return the next combination of length combinationLength in
     *         lexicographical order.
     */
    public abstract String next();

    /**
     * @return true if and only if there exists a next combination.
     */
    public abstract boolean hasNext();
}
