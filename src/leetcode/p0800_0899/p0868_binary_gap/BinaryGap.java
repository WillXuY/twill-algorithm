/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

public interface BinaryGap {
    /**
     * Given a positive integer n, find and return the longest distance
     * between any two adjacent 1's in the binary representation of n.
     * If there are no two adjacent 1's, return 0.
     * Two 1's are adjacent if there are only 0's separating them
     * (possibly no 0's). The distance between two 1's is the absolute
     * difference between their bit positions. For example, the two 1's
     * in "1001" have a distance of 3.
     *
     * @param n 1 <= n <= 10^9
     * @return the longest distance between any two adjacent 1's.
     */
    int binaryGap(int n);
}
