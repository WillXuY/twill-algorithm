package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MinMaxGame;

public class MinMaxGameLoop implements MinMaxGame {
    @Override
    public int minMaxGame(int[] nums) {
        int[] newNums = nums;
        while (newNums.length > 1) {
            boolean isMin = true;
            int[] next = new int[newNums.length / 2];
            for (int i = 0; i < next.length; i++) {
                if (isMin) {
                    next[i] = Math.min(newNums[i * 2], newNums[i * 2 + 1]);
                } else {
                    next[i] = Math.max(newNums[i * 2], newNums[i * 2 + 1]);
                }
                isMin = !isMin;
            }
            newNums = next;
        }
        return newNums[0];
    }
}
