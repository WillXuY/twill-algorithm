/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0771_jewels_and_stones;

public interface JewelsAndStones {
    /**
     * You're given strings jewels representing the types of stones that
     * are jewels, and stones representing the stones you have. Each
     * character in stones is a type of stone you have. You want to know
     * how many of the stones you have are also jewels.
     * Letters are case sensitive, so "a" is considered a different type
     * of stone from "A".
     *
     * @param jewels 1 <= jewels.length, stones.length <= 50
     *               consists of only English letters.
     * @param stones 1 <= stones.length <= 50
     *               consists of only English letters.
     * @return number of jewels.
     */
    int numJewelsInStones(String jewels, String stones);
}
