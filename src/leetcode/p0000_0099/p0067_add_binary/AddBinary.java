/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0000_0099.p0067_add_binary;

public interface AddBinary {
    /**
     * Given two binary strings a and b, return their sum as a binary
     * string.
     *
     * Constraints:
     * Each string does not contain leading zeros except for the zero
     * itself.
     *
     * @param a 1 <= a.length <= 10^4
     *          consist only of '0' or '1' characters.
     * @param b 1 <= b.length <= 10^4
     *          consist only of '0' or '1' characters.
     * @return sum of a and b
     */
    String addBinary(String a, String b);
}
