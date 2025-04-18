/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0900_0999.p0984_string_without_aaa_or_bbb;

public interface StringWithoutAaaOrBbbService {
    /**
     * Given two integers A and B, return any string S such that:
     * - S has length A + B and contains exactly A 'a' letters, and exactly B
     *   'b' letters;
     * - The substring 'aaa' does not occur in S;
     * - The substring 'bbb' does not occur in S;
     * Note:
     *   1. 0 <= A <= 100
     *   2. 0 <= B <= 100
     *   3. It is guaranteed such an S exists for the given A and B
     * Example 1:
     * Input: A = 1, B = 2
     * Output: "abb"
     * Explanation: "abb" || "bab" || "bba"
     */
    String getStringWithoutAaaOrBbb(int A, int B);
}
