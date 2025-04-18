/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.ValidAnagram;

public class ValidAnagramRemove implements ValidAnagram {
    @Override
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        while (s.length() > 0) {
            char c = s.charAt(0);
            s = s.replaceAll(String.valueOf(c), "");
            t = t.replaceAll(String.valueOf(c), "");
            if (s.length() != t.length()) {
                return false;
            }
        }
        return true;
    }
}
