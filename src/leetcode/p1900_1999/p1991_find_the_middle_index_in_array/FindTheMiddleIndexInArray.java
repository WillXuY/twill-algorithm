package leetcode.p1900_1999.p1991_find_the_middle_index_in_array;

public interface FindTheMiddleIndexInArray {
    /**
     * Given a 0-indexed integer array nums, find the leftmost
     * middleIndex (i.e., the smallest amongst all the possible ones).
     * <p>
     * A middleIndex is an index where nums[0] + nums[1] + ...
     * + nums[middleIndex-1] == nums[middleIndex+1]
     * + nums[middleIndex+2] + ... + nums[nums.length-1].
     * <p>
     * If middleIndex == 0, the left side sum is considered to be 0.
     * Similarly, if middleIndex == nums.length - 1, the right side sum
     * is considered to be 0.
     * <p>
     * Return the leftmost middleIndex that satisfies the condition, or
     * -1 if there is no such index.
     *
     * @param nums 1 <= nums.length <= 100
     *             -1000 <= nums[i] <= 1000
     */
    int findMiddleIndex(int[] nums);
}
