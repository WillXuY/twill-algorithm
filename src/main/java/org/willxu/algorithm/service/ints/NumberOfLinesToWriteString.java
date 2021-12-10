/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.ints;

public interface NumberOfLinesToWriteString {
    /**
     * You are given a string s of lowercase English letters and an
     * array widths denoting how many pixels wide each lowercase English
     * letter is. Specifically, widths[0] is the width of 'a', widths[1]
     * is the width of 'b', and so on.
     * You are trying to write s across several lines, where each line
     * is no longer than 100 pixels. Starting at the beginning of s,
     * write as many letters on the first line such that the total width
     * does not exceed 100 pixels. Then, from where you stopped in s,
     * continue writing as many letters as you can on the second line.
     * Continue this process until you have written all of s.
     * Return an array result of length 2 where:
     * - result[0] is the total number of lines.
     * - result[1] is the width of the last line in pixels.
     *
     * @param widths widths.length = 26
     *               2 <= widths[i] <= 10
     * @param s 1 <= s.length <= 1000
     *          contains only lowercase English letters.
     * @return number of lines, the width of last line.
     */
    int[] numberOfLines(int[] widths, String s);
}
