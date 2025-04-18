package leetcode.p2300_2399.p2395_find_subarrays_with_equal_sum;

import java.util.HashSet;
import java.util.Set;

public class FindSubarraysWithEqualSumLoop
        implements FindSubarraysWithEqualSum {
    @Override
    public boolean findSubarrays(int[] nums) {
        Set<Integer> sum = new HashSet<>();
        for (int i = 1; i < nums.length; i++) {
            int s = nums[i] + nums[i - 1];
            if (sum.contains(s)) {
                return true;
            }
            sum.add(s);
        }
        return false;
    }
}
