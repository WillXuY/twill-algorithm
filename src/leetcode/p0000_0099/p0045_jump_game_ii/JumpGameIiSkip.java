package leetcode.p0000_0099.p0045_jump_game_ii;

public class JumpGameIiSkip implements JumpGameIi {
    @Override
    public int jump(int[] nums) {
        int len = nums.length;
        if (len <= 1) {
            return 0;
        }
        int end = nums[0];
        int maxRange = end;
        int result = 1;
        if (maxRange >= len - 1) {
            return result;
        }
        for (int i = 1; i < len; i++) {
            int range = i + nums[i];
            if (range >= len - 1) {
                result++;
                break;
            }
            if (range > maxRange) {
                maxRange = range;
            }
            if (i >= end) {
                end = maxRange;
                result++;
            }
        }
        return result;
    }
}
