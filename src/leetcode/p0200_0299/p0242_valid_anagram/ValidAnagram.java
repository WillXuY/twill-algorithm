/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0242_valid_anagram;

public interface ValidAnagram {
    /**
     * Given two string s and t, return true if t is an anagram of s,
     * and false otherwise.
     *
     * Follow up:
     * What if the inputs contain Unicode characters? How would you
     * adapt your solution to such a case?
     *
     * @param s 1 <= s.length <= 5 * 10^4
     * @param t 1 <= t.length <= 5 * 10^4
     *          s and t consist of lowercase English letters.
     * @return is valid anagram.
     */
    boolean isAnagram(String s, String t);
}
