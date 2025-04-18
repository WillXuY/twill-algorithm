package leetcode.p0000_0099.p0016_three_sum_closest;

import java.util.Arrays;

public class ThreeSumClosestPointer implements ThreeSumClosest {
    @Override
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int output = 0;
        int maxDiff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                int diff = target - sum;
                if (Math.abs(diff) < maxDiff) {
                    output = sum;
                    maxDiff = Math.abs(diff);
                }
                if (diff == 0) {
                    return sum;
                } else if (diff < 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return output;
    }
}
