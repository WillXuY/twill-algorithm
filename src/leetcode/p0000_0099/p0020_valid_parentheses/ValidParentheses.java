/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0000_0099.p0020_valid_parentheses;

public interface ValidParentheses {
    /**
     * Given a string s containing just the characters '(', ')', '{',
     * '}', '[' and ']', determine if the input string is valid.
     *
     * An input string is valid if:
     * 1. Open brackets must be closed by the same type of brackets.
     * 2. Open brackets must be closed in the correct order.
     *
     * @param s - 1 <= s.length <= 10^4
     *          - s consists of parentheses only '(){}[]'.
     * @return is valid
     */
    boolean isValid(String s);
}
