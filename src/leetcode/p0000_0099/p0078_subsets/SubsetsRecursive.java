package leetcode.p0000_0099.p0078_subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubsetsRecursive implements Subsets {
    @Override
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.emptyList());
        if (nums.length == 1) {
            List<Integer> r = new ArrayList<>();
            r.add(nums[0]);
            result.add(r);
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> subList = subsets(
                    Arrays.copyOfRange(nums, i + 1, nums.length));
            for (List<Integer> sub: subList) {
                List<Integer> r = new ArrayList<>();
                r.add(nums[i]);
                r.addAll(sub);
                result.add(r);
            }
        }
        return result;
    }
}
