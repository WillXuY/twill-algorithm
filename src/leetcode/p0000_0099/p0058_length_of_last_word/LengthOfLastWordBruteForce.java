/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0000_0099.p0058_length_of_last_word;

public class LengthOfLastWordBruteForce implements LengthOfLastWord {
    @Override
    public int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        return split.length == 0 ? 0 : split[split.length - 1].length();
    }
}
