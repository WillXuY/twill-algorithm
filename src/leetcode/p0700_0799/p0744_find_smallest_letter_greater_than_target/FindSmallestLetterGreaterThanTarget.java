/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0744_find_smallest_letter_greater_than_target;

public interface FindSmallestLetterGreaterThanTarget {
    /**
     * Given a character array letters that is sorted in non-decreasing
     * order and a character target, return the smallest character in
     * the array that is larger than target.
     * Note that the letters wrap around.
     * - For example, if target == 'z' and letters == ['a', 'b'], the
     *   answer is 'a'.
     *
     * @param letters 2 <= letters.length <= 10^4
     *                letters[i] is a lowercase English letter.
     *                letters is sorted in non-decreasing order.
     *                contains at least two different characters.
     * @param target is a lowercase English letter.
     * @return the next greatest letter.
     */
    char nextGreatestLetter(char[] letters, char target);
}
