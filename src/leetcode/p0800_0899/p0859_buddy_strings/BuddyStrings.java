/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0800_0899.p0859_buddy_strings;

public interface BuddyStrings {
    /**
     * Given two string s and goal, return true if you can swap two
     * letters in s so the result is equal to goal, otherwise, return
     * false.
     * Swapping letters is defined as taking two indices i and j
     * (0-indexed) such that i != j and swapping the characters at s[i]
     * and s[j].
     * - For example, swapping at indices 0 and 2 in "abcd" result in
     *   "cbad".
     *
     * @param s 1 <= s.length <= 2 * 10^4
     *          consist of lowercase letters.
     * @param goal 1 <= goal.length <= 2 * 10^4
     *             consist of lowercase letters.
     * @return can s be equal to goal after swap two letters.
     */
    boolean buddyStrings(String s, String goal);
}
