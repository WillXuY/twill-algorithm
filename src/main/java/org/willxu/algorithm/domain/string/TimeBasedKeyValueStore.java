package org.willxu.algorithm.domain.string;

/**
 * Design a time-based key-value data structure that can store multiple
 * values for the same key at different time stamps and retrieve the
 * key's value at a certain timestamp.
 * <p>
 * Implement the TimeMap class:
 * <p>
 * TimeMap() Initializes the object of the data structure.
 */
public interface TimeBasedKeyValueStore {
    /**
     * Stores the key key with the value value at the given time
     * timestamp.
     *
     * @param key,value 1 <= key.length, value.length <= 100
     *                  consist of lowercase English letters and
     *                  digits.
     * @param value consist of lowercase English letters and
     * @param timestamp 1 <= timestamp <= 10^7
     *                  timestamp of set are strictly increasing.
     *                  At most 2 * 10^5 calls will be made to set and
     *                  get.
     */
    void set(String key, String value, int timestamp);

    /**
     * @param key 1 <= key.length <= 100
     *            consist of lowercase English letters and digits.
     * @param timestamp 1 <= timestamp <= 10^7
     * @return a value such that set was called previously, with
     *         timestamp_prev <= timestamp. If there are multiple such
     *         values, it returns the value associated with the largest
     *         timestamp_prev. If there are no values, it returns "".
     */
    String get(String key, int timestamp);
}
