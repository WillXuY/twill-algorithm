/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0800_0899.p0824_goat_latin;

public class GoatLatinLoop implements GoatLatin {
    @Override
    public String toGoatLatin(String sentence) {
        StringBuilder builder = new StringBuilder();
        int countFollow = 1;
        char lead = ' ';
        for (char c: sentence.toCharArray()) {
            if (c == ' ') {
                if (lead != '*') {
                    builder.append(lead);
                }
                builder.append("ma");
                builder.append("a".repeat(countFollow));
                builder.append(' ');
                countFollow++;
                lead = ' ';
            } else {
                if (lead == ' ') {
                    if (isVowel(c)) {
                        builder.append(c);
                        lead = '*';
                    } else {
                        lead = c;
                    }
                } else {
                    builder.append(c);
                }
            }
        }
        if (lead != '*') {
            builder.append(lead);
        }
        builder.append("ma");
        builder.append("a".repeat(countFollow));
        return builder.toString();
    }

    private boolean isVowel(char c) {
        char[] vowels = new char[] {
                'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char v: vowels) {
            if (v == c) {
                return true;
            }
        }
        return false;
    }
}
