/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.domain.map;

/**
 * Design a HashMap without using any built-in hash table libraries.
 */
public interface DesignHashMap {
    /**
     * Inserts a (key, value) pair into the HashMap. If the key already
     * exists in the map, update the corresponding value.
     *
     * @param key 0 <= key <= 10^6
     * @param value 0 <= value <= 10^6
     */
    void put(int key, int value);

    /**
     * Returns the value to which the specified key is mapped, or -1 if
     * this map contains no mapping for the key.
     *
     * @param key 0 <= key <= 10^6
     * @return the value.
     */
    int get(int key);

    /**
     * Removes the key and its corresponding value if the map contains
     * the mapping for the key.
     *
     * @param key 0 <= key <= 10^6
     */
    void remove(int key);
}
