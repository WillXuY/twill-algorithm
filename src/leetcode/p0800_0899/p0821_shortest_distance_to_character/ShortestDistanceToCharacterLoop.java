/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0800_0899.p0821_shortest_distance_to_character;

public class ShortestDistanceToCharacterLoop
        implements ShortestDistanceToCharacter {
    @Override
    public int[] shortestToChar(String s, char c) {
        int lastIndex = -1;
        char[] chars = s.toCharArray();
        int[] output = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != c) {
                if (lastIndex == -1) {
                    for (int j = 0; j <= i; j++) {
                        output[j]++;
                    }
                } else {
                    // length = last + 1
                    output[i] = output[i - 1] + 1;
                }
            } else {
                if (lastIndex != -1) {
                    int len = i - lastIndex - 1;
                    for (int j = 1; j <= len / 2; j++) {
                        output[i - j] = j;
                    }
                }
                lastIndex = i;
            }
        }
        return output;
    }
}
