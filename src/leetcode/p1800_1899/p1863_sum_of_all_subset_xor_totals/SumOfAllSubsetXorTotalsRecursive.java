package leetcode.p1800_1899.p1863_sum_of_all_subset_xor_totals;

import java.util.*;

public class SumOfAllSubsetXorTotalsRecursive implements SumOfAllSubsetXorTotals {
    @Override
    public int subsetXORSum(int[] nums) {
        int output = 0;
        for (int length = 1; length <= nums.length; length++) {
            List<List<Integer>> combination = getCombination(nums, length);
            for (List<Integer> c: combination) {
                int x = c.get(0);
                for (int i = 1; i < c.size(); i++) {
                    x = x ^ c.get(i);
                }
                output += x;
            }
        }
        return output;
    }

    private List<List<Integer>> getCombination(int[] nums, int total) {
        List<List<Integer>> output = new ArrayList<>();
        if (total < 1 || nums.length < total) {
            return output;
        }
        if (total == 1) {
            for (int n: nums) {
                List<Integer> list = new ArrayList<>();
                list.add(n);
                output.add(list);
            }
            return output;
        }
        for (int i = 0; i < nums.length; i++) {
            int[] leftover = Arrays.copyOfRange(nums, i + 1, nums.length);
            List<List<Integer>> subList = getCombination(leftover, total - 1);
            for (List<Integer> s: subList) {
                s.add(0, nums[i]);
                output.add(s);
            }
        }
        return output;
    }
}
