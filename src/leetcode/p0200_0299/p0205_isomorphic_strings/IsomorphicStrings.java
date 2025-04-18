/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0205_isomorphic_strings;

public interface IsomorphicStrings {
    /**
     * Given two string s and t, determine if they are isomorphic.
     *
     * Two string s and t are isomorphic if the characters in s can be
     * replaced to get t.
     *
     * All occurrences of a character must be replaced with another
     * characters while preserving the order of characters. No two
     * characters may map to the same character, but a character may
     * map to itself.
     *
     * @param s 1 <= s.length <= 5 * 10^4
     * @param t t.length == s.length
     *          s and t consist of any valid ascii character.
     * @return is isomorphic or not
     */
    boolean isIsomorphic(String s, String t);
}
