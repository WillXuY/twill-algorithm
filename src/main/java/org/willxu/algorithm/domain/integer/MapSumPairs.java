package org.willxu.algorithm.domain.integer;

/**
 * Design a map that allows you to do the following:
 * <p>
 * - Maps a string key to a given value.
 * - Returns the sum of the values that have a key with a prefix equal to a given string.
 * <p>
 * Implement the MapSum class:
 * <p>
 * MapSum() Initializes the MapSum object.
 * <p>
 * At most 50 calls will be made to insert and sum.
 */
public interface MapSumPairs {
    /**
     * Inserts the key-val pair into the map. If the key already existed,
     * the original key-value pair will be overridden to the new one.
     *
     * @param key 1 <= key.length <= 50
     *            consist of only lowercase English letters.
     * @param val 1 <= val <= 1000
     */
    void insert(String key, int val);

    /**
     * @param prefix 1 <= prefix.length <= 50
     *               consist of only lowercase English letters.
     * @return the sum of all the pairs' value whose key starts with the
     *         prefix.
     */
    int sum(String prefix);
}
