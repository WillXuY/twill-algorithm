package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.ReverseBits;

public class ReversBitsToString implements ReverseBits {
    @Override
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
        sb.reverse();
        sb.append("0".repeat(Math.max(0, 32 - sb.length())));
        return (int) Long.parseLong(sb.toString(), 2);
    }
}
