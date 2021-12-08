/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.RotateString;

public class RotateStringLoop implements RotateString {
    @Override
    public boolean rotateString(String s, String goal) {
        char[] chars = s.toCharArray();
        char[] charGoal = goal.toCharArray();
        int len = charGoal.length;
        if (len != chars.length) {
            return false;
        }
        for (int offset = 0; offset < len; offset++) {
            if (chars[0] != charGoal[offset]) {
                continue;
            }
            boolean same = true;
            for (int i = 0; i < len; i++) {
                int o = offset + i >= len ? offset + i - len : offset + i;
                if (chars[i] != charGoal[o]) {
                    same = false;
                    break;
                }
            }
            if (same) {
                return true;
            }
        }
        return false;
    }
}
