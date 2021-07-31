/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

public interface LengthOfLastWord {
    /**
     * Given a string s consists of some words separated by spaces,
     * return the length of the last word in the string. If the last
     * word does not exist, return 0.
     *
     * A word is a maximal substring consisting of non-space characters
     * only.
     *
     * @param s 1 <= s.length <= 10^4
     *          s consists of only English letters and spaces ' '.
     * @return the length of last word
     */
    int lengthOfLastWord(String s);
}
