/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0748_shortest_completing_word;

import java.util.HashMap;

public class ShortestCompletingWordLoop implements ShortestCompletingWord {
    @Override
    public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        int licenseCount = 0;
        for (Character c: licensePlate.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                char lower = (char) (c + 32);
                if (charMap.containsKey(lower)) {
                    charMap.put(lower, charMap.get(lower) + 1);
                } else {
                    charMap.put(lower, 1);
                }
                licenseCount++;
            } else if (c >= 'a' && c <= 'z') {
                if (charMap.containsKey(c)) {
                    charMap.put(c, charMap.get(c) + 1);
                } else {
                    charMap.put(c, 1);
                }
                licenseCount++;
            }
        }
        String output = null;
        for (String s: words) {
            if (licenseCount > s.length()) {
                continue;
            }
            HashMap<Character, Integer> exits = new HashMap<>();
            for (char c: s.toCharArray()) {
                if (exits.containsKey(c)) {
                    exits.put(c, exits.get(c) + 1);
                } else {
                    exits.put(c, 1);
                }
            }
            boolean notMatches = false;
            for (Character c: charMap.keySet()) {
                if (!exits.containsKey(c) || exits.get(c) < charMap.get(c)) {
                    notMatches = true;
                    break;
                }
            }
            if (notMatches) {
                continue;
            }
            if (output == null || output.length() > s.length()) {
                output = s;
            }
        }
        return output;
    }
}
