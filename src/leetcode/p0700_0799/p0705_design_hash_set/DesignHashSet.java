/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0705_design_hash_set;

/**
 * Design a HashSet without using any built-in hash table libraries.
 */
public interface DesignHashSet {
    /**
     * Insert the value key into the HashSet.
     *
     * @param key value to insert.
     *            0 <= key <= 10^6
     */
    void add(int key);

    /**
     * Removes the value key int the HashSet. If key does not exist in
     * the HashSet, do nothing.
     *
     * @param key remove the key's value.
     *            0 <= key <= 10^6
     */
    void remove(int key);

    /**
     * Returns whether the value key exists in the HashSet or not.
     *
     * @param key is this value exit.
     *            0 <= key <= 10^6
     */
    boolean contains(int key);
}
