package org.willxu.algorithm.service.integer;

public interface NumberOfDiceRollsWithTargetSum {
    /**
     * You have n dice, and each dice has k faces numbered from 1 to k.
     * <p>
     * Given three integers n, k, and target, return the number of
     * possible ways (out of the k^n total ways) to roll the dice, so
     * the sum of the face-up numbers equals target. Since the answer
     * may be too large, return it modulo 10^9 + 7.
     *
     * @param n,k 1 <= n, k <= 30
     * @param target 1 <= target <= 1000
     */
    int numRollsToTarget(int n, int k, int target);
}
