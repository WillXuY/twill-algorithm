package leetcode.p0000_0099.p0018_four_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FourSumLoop implements FourSum {
    @Override
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) {
            return Collections.emptyList();
        }
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                long targetSum = (long)target - nums[i] - nums[j];
                int low = j + 1;
                int high = nums.length - 1;
                while (low < high) {
                    int sumLh = nums[low] + nums[high];
                    if (sumLh == targetSum) {
                        List<Integer> o = new ArrayList<>();
                        o.add(nums[i]);
                        o.add(nums[j]);
                        o.add(nums[low]);
                        o.add(nums[high]);
                        output.add(o);
                        int addedIndex = low;
                        low++;
                        while (low < high && nums[addedIndex] == nums[low]) {
                            low++;
                        }
                    } else if (sumLh < targetSum) {
                        low++;
                    } else {
                        high--;
                    }
                }
                int addedJ = j;
                j++;
                while (j < nums.length && nums[j] == nums[addedJ]) {
                    j++;
                }
                j--;
            }
            int addedI = i;
            i++;
            while (i < nums.length && nums[i] == nums[addedI]) {
                i++;
            }
            i--;
        }
        return output;
    }
}
