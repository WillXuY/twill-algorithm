package leetcode.p0000_0099.p0039_combination_sum;

import java.util.List;

public interface CombinationSum {
    /**
     * Given an array of distinct integers candidates and a target
     * integer target, return a list of all unique combinations of
     * candidates where the chosen numbers sum to target. You may return
     * the combinations in any order.
     * <p>
     * The same number may be chosen from candidates an unlimited number
     * of times. Two combinations are unique if the frequency of at
     * least one of the chosen numbers is different.
     * <p>
     * The test cases are generated such that the number of unique
     * combinations that sum up to target is less than 150 combinations
     * for the given input.
     *
     * @param candidates 1 <= candidates.length <= 30
     *                   2 <= candidates[i] <= 40
     *                   All elements of candidates are distinct.
     * @param target 1 <= target <= 40
     */
    List<List<Integer>> combinationSum(int[] candidates, int target);
}
