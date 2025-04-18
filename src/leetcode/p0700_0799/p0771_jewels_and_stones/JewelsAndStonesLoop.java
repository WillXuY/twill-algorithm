/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0771_jewels_and_stones;

public class JewelsAndStonesLoop implements JewelsAndStones {
    @Override
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char c: stones.toCharArray()) {
            if (jewels.contains(String.valueOf(c))) {
                count++;
            }
        }
        return count;
    }
}
