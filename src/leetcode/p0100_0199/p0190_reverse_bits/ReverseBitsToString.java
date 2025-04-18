/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0190_reverse_bits;

import org.willxu.algorithm.service.integer.ReverseBits;

public class ReverseBitsToString implements ReverseBits {
    @Override
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
        sb.reverse();
        sb.append("0".repeat(Math.max(0, 32 - sb.length())));
        return (int) Long.parseLong(sb.toString(), 2);
    }
}
