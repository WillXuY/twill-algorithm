/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.BackspaceStringCompare;

public class BackspaceStringCompareLoop implements BackspaceStringCompare {
    @Override
    public boolean backspaceCompare(String s, String t) {
        return getStringBackspace(s).equals(getStringBackspace(t));
    }

    private String getStringBackspace(String s) {
        StringBuilder builder = new StringBuilder();
        for (char c: s.toCharArray()) {
            if ('#' != c) {
                builder.append(c);
            } else if (builder.length() > 0) {
                builder.deleteCharAt(builder.length() - 1);
            }
        }
        return builder.toString();
    }
}
