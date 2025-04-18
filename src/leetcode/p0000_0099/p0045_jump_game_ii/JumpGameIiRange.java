package leetcode.p0000_0099.p0045_jump_game_ii;

import java.util.HashSet;
import java.util.Set;

public class JumpGameIiRange implements JumpGameIi {
    @Override
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        Set<Integer> arriveRange = new HashSet<>();
        Set<Integer> reachedIndex = new HashSet<>();
        arriveRange.add(0);
        reachedIndex.add(0);
        int result = 0;
        while (arriveRange.size() > 0) {
            Set<Integer> nextRange = new HashSet<>();
            for (int arriveIndex: arriveRange) {
                int range = nums[arriveIndex];
                for (int j = 1; j <= range; j++) {
                    int index = arriveIndex + j;
                    if (reachedIndex.contains(index)) {
                        continue;
                    }
                    nextRange.add(index);
                    if (index >= nums.length - 1) {
                        return result + 1;
                    }
                }
            }
            arriveRange = nextRange;
            result++;
        }
        return result;
    }
}
