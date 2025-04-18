/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0600_0699.p0696_count_binary_substrings;

public interface CountBinarySubstrings {
    /**
     * Give a binary string s, return the number of non-empty substrings
     * that have the same number of 0's and 1's, and all the 0's and all
     * the 1's in these substrings are grouped consecutively.
     * Substrings that occur multiple times are counted the number of
     * times they occur.
     *
     * @param s 1 <= s.length <= 10^5
     *          s[i] is either '0' or '1'.
     * @return count substrings.
     */
    int countBinarySubstrings(String s);
}
