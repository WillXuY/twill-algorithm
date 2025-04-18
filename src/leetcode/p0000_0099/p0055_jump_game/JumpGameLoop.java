package leetcode.p0000_0099.p0055_jump_game;

public class JumpGameLoop implements JumpGame {
    @Override
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int end = nums[0];
        int maxRange = 0;
        for (int i = 0; i < nums.length; i++) {
            int range = i + nums[i];
            if (range >= nums.length - 1) {
                break;
            }
            if (range > maxRange) {
                maxRange = range;
            }
            if (i >= end) {
                if (maxRange == end) {
                    return false;
                }
                end = maxRange;
            }
        }
        return true;
    }
}
