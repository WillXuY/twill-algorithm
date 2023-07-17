package org.willxu.algorithm.service.integer;

public interface WiggleSusequence {
    /**
     * A wiggle sequence is a sequence where the differences between
     * successive numbers strictly alternate between positive and
     * negative. The first difference (if one exists) may be either
     * positive or negative. A sequence with one element and a sequence
     * with two non-equal elements are trivially wiggle sequences.
     * <p>
     * - For example, [1, 7, 4, 9, 2, 5] is a wiggle sequence because
     *   the differences (6, -3, 5, -7, 3) alternate between positive
     *   and negative.
     * - In contrast, [1, 4, 7, 2, 5] and [1, 7, 4, 5, 5] are not wiggle
     *   sequences. The first is not because its first two differences
     *   are positive, and the second is not because its last difference
     *   is zero.
     * <p>
     * A subsequence is obtained by deleting some elements (possibly
     * zero) from the original sequence, leaving the remaining elements
     * in their original order.
     * <p>
     * Given an integer array nums, return the length of the longest
     * wiggle subsequence of nums.
     *
     * @param nums 1 <= nums.length <= 1000
     *             0 <= nums[i] <= 1000
     */
    int wiggleMaxLength(int[] nums);
}
