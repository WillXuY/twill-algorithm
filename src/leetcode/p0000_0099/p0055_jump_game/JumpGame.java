package leetcode.p0000_0099.p0055_jump_game;

public interface JumpGame {
    /**
     * You are given an integer array nums. You are initially positioned
     * at the array's first index, and each element in the array
     * represents your maximum jump length at that position.
     * <p>
     * Return true if you can reach the last index, or false otherwise.
     *
     * @param nums 1 <= nums.length <= 104
     *             0 <= nums[i] <= 105
     */
    boolean canJump(int[] nums);
}
