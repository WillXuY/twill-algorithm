/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0800_0899.p0819_most_common_word;

import java.util.HashMap;
import java.util.Map;

public class MostCommonWordLoop implements MostCommonWord {
    @Override
    public String mostCommonWord(String paragraph, String[] banned) {
        String mostCommonWord = "";
        Map<String, Integer> countMap = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        for (char p: paragraph.toCharArray()) {
            if (isLetter(p)) {
                builder.append(p);
            } else if (builder.length() > 0) {
                String word = builder.toString().toLowerCase();
                boolean isBanned = false;
                for (String b: banned) {
                    if (b.equals(word)) {
                        isBanned = true;
                        break;
                    }
                }
                if (isBanned) {
                    builder = new StringBuilder();
                    continue;
                }
                if ("".equals(mostCommonWord)) {
                    mostCommonWord = word;
                    countMap.put(word, 1);
                } else if (countMap.containsKey(word)) {
                    int count = countMap.get(word) + 1;
                    countMap.put(word, count);
                    if (count > countMap.get(mostCommonWord)) {
                        mostCommonWord = word;
                    }
                } else {
                    countMap.put(word, 1);
                }
                builder = new StringBuilder();
            }
        }
        if ("".equals(mostCommonWord) && builder.length() > 0) {
            return builder.toString().toLowerCase();
        }
        return mostCommonWord;
    }

    public boolean isLetter(char c) {
        char[] notLetter = new char[] {'!', '?', '\'', ',', ';', '.', ' '};
        for (char n: notLetter) {
            if (n == c) {
                return false;
            }
        }
        return true;
    }
}
