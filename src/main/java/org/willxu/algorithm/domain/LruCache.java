package org.willxu.algorithm.domain;

/**
 * Design a data structure that follows the constraints of a Least
 * Recently Used (LRU) cache.
 * <p>
 * Implement the LRUCache class:
 * <p>
 * LRUCache(int capacity) Initialize the LRU cache with positive
 * size capacity.
 * <p>
 * The functions get and put must each run in O(1) average time
 * complexity.
 * <p>
 * 1 <= capacity <= 3000
 */
public interface LruCache {
    /**
     * Return the value of the key if the key exists,
     * otherwise return -1.
     *
     * @param key 0 <= key <= 10^4
     */
    int get(int key);

    /**
     * Update the value of the key if the key exists. Otherwise, add the
     * key-value pair to the cache. If the number of keys exceeds the
     * capacity from this operation, evict the least recently used key.
     *
     * @param key 0 <= key <= 10^4
     * @param value 0 <= value <= 10^5
     */
    void put(int key, int value);
}
