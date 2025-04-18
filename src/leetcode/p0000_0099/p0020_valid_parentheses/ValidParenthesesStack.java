/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.ValidParentheses;

import java.util.Stack;

public class ValidParenthesesStack implements ValidParentheses {
    @Override
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if ('(' == c || '[' == c || '{' == c) {
                stack.push(c);
            } else if (')' == c) {
                if (stack.empty()) {
                    return false;
                }
                if ('(' != stack.pop()) {
                    return false;
                }
            } else if (']' == c) {
                if (stack.empty()) {
                    return false;
                }
                if ('[' != stack.pop()) {
                    return false;
                }
            } else if ('}' == c) {
                if (stack.empty()) {
                    return false;
                }
                if ('{' != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
