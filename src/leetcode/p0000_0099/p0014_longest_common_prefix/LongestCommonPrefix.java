/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0000_0099.p0014_longest_common_prefix;

public interface LongestCommonPrefix {
    /**
     * Write a function to find the longest common prefix string
     * amongst an array of strings.
     *
     * If there is no common prefix, return an empty string "".
     *
     * @param strs - 1 <= strs.length <= 200
     *             - 0 <= strs[i].length <= 200
     *             - strs[i] consists of only lower-case English
     *             letters.
     * @return longest common prefix
     */
    String longestCommonPrefix(String[] strs);
}
