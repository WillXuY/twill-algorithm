/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.UniqueMorseCodeWords;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWordsSet implements UniqueMorseCodeWords {
    @Override
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = new String[] {
                ".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-",
                "..-","...-",".--","-..-","-.--","--.."};
        Set<String> codeSet = new HashSet<>();
        for (String s: words) {
            StringBuilder builder = new StringBuilder();
            for (char c: s.toCharArray()) {
                builder.append(codes[c - 'a']);
            }
            codeSet.add(builder.toString());
        }
        return codeSet.size();
    }
}
