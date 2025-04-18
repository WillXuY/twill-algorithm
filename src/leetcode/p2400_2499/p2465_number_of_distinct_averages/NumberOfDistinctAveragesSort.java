package leetcode.p2400_2499.p2465_number_of_distinct_averages;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctAveragesSort implements NumberOfDistinctAverages {
    @Override
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> sum = new HashSet<>();
        for (int i = 0; i < nums.length / 2; i++) {
            sum.add(nums[i] + nums[nums.length - 1 - i]);
        }
        return sum.size();
    }
}
