package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface CombinationSumIi {
    /**
     * Given a collection of candidate numbers (candidates) and a target
     * number (target), find all unique combinations in candidates where
     * the candidate numbers sum to target.
     * <p>
     * Each number in candidates may only be used once in the
     * combination.
     * <p>
     * Note: The solution set must not contain duplicate combinations.
     *
     * @param candidates 1 <= candidates.length <= 100
     *                   1 <= candidates[i] <= 50
     * @param target 1 <= target <= 30
     */
    List<List<Integer>> combinationSum2(int[] candidates, int target);
}
