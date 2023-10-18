package org.willxu.algorithm.service.string;

public interface OptimalDivision {
    /**
     * You are given an integer array nums. The adjacent integers in
     * nums will perform the float division.
     * <p>
     * For example, for nums = [2,3,4], we will evaluate the expression
     * "2/3/4".
     * <p>
     * However, you can add any number of parenthesis at any position to
     * change the priority of operations. You want to add these
     * parentheses such the value of the expression after the evaluation
     * is maximum.
     * <p>
     * Return the corresponding expression that has the maximum value in
     * string format.
     * <p>
     * Note: your expression should not contain redundant parenthesis.
     *
     * @param nums 1 <= nums.length <= 10
     *             2 <= nums[i] <= 1000
     *             There is only one optimal division for the given
     *             input.
     */
    String optimalDivision(int[] nums);
}
