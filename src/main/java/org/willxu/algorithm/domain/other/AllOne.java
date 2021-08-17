/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.domain.other;

/**
 * Design a data structure to store the string' count with the ability
 * to return the strings with minimum and maximum counts.
 *
 * Constraints:
 * - It is guaranteed that for each call to dec, key is existing in the
 *   data structure.
 * - At most 5 * 10^4 calls will be made to inc, dec, getMaxKey, and
 *   getMinKey.
 */
public interface AllOne {
    /**
     * Inserts a new key <Key> with value 1.
     * Or increments an existing key by 1.
     *
     * @param key 1 <= key.length <= 10
     *            key consists of lowercase English letters.
     */
    void inc(String key);

    /**
     * Decrements an existing key by 1. If Key's value is 1, remove it
     * from the data structure.
     *
     * @param key 1 <= key.length <= 10
     *            key consists of lowercase English letters.
     */
    void dec(String key);

    /**
     * Returns one of the keys with maximal value.
     * */
    String getMaxKey();

    /**
     * Returns one of the keys with Minimal value.
     */
    String getMinKey();
}
