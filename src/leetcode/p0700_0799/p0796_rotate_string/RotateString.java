/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0796_rotate_string;

public interface RotateString {
    /**
     * Given two string s and goal, return true if and only if s can
     * become goal after some number of shifts on s.
     * A shift on s consists of moving the leftmost character of s to
     * the rightmost position.
     * - For example, if s = "abcde", then it will be "bcdea" after one
     *   shift.
     *
     * @param s 1 <= s.length <= 100
     *          consists of lowercase English letters.
     * @param goal 1 <= goal.length <= 100
     *          consists of lowercase English letters.
     * @return s can become goal after some number of shifts on s.
     */
    boolean rotateString(String s, String goal);
}
