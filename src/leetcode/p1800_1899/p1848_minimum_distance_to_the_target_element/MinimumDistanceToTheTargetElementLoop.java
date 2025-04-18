package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MinimumDistanceToTheTargetElement;

public class MinimumDistanceToTheTargetElementLoop
        implements MinimumDistanceToTheTargetElement {
    @Override
    public int getMinDistance(int[] nums, int target, int start) {
        int len = nums.length;
        for (int abs = 0; abs < len; abs++) {
            if (start - abs >= 0 && nums[start - abs] == target) {
                return abs;
            }
            if (start + abs < len && nums[start + abs] == target) {
                return abs;
            }
        }
        return 0;
    }
}
