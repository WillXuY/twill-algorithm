/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0717_one_bit_and2_bit_characters;

public class OneBitAnd2BitCharactersLoop implements OneBitAnd2BitCharacters {
    @Override
    public boolean isOneBitCharacter(int[] bits) {
        if (bits.length == 1) {
            return true;
        }
        for (int i = 2; i < bits.length; i++) {
            if ((i & 1) == 1 && bits[bits.length - i] == 0) {
                return false;
            } else if ((i & 1) == 0 && bits[bits.length - i] == 0) {
                return true;
            }
        }
        return ((bits.length & 1) == 1 && bits[0] == 1)
                ||((bits.length & 1) == 0 && bits[0] == 0);
    }
}
