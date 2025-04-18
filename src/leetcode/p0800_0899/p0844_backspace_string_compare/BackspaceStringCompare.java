/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.bool;

public interface BackspaceStringCompare {
    /**
     * Given two string s and t, return true if they are equal when both
     * are typed into empty text editors. '#' means a backspace
     * character.
     * Note that after backspacing an empty text, the text will continue
     * empty.
     *
     * Follow up: Can you solve it in O(n) time and O(1) space?
     *
     * @param s 1 <= s.length <= 200
     *          only contain lowercase letters and '#' characters.
     * @param t 1 <= t.length <= 200
     *          only contain lowercase letters and '#' characters.
     * @return is s and t same after backspace.
     */
    boolean backspaceCompare(String s, String t);
}
