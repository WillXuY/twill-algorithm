package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.PredictTheWinner;

import java.util.Arrays;

public class PredictTheWinnerRecursive implements PredictTheWinner {
    int[][] bestScores;

    @Override
    public boolean predictTheWinner(int[] nums) {
        int length = nums.length;
        bestScores = new int[length][length];
        for (int[] b: bestScores) {
            Arrays.fill(b, -1);
        }
        return score(nums, 0, length - 1) >= 0;
    }

    private int score(int[] nums, int l, int r) {
        if (bestScores[l][r] != -1) {
            return bestScores[l][r];
        }
        if (l == r) {
            return nums[l];
        }
        int chooseLeft = nums[l] - score(nums, l + 1, r);
        int chooseRight = nums[r] - score(nums, l, r - 1);
        bestScores[l][r] = Math.max(chooseLeft, chooseRight);
        return bestScores[l][r];
    }
}
