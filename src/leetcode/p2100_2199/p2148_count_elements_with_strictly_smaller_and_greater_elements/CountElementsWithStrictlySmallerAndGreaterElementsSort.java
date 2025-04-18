package leetcode.p2100_2199.p2148_count_elements_with_strictly_smaller_and_greater_elements;

import java.util.Arrays;

public class CountElementsWithStrictlySmallerAndGreaterElementsSort
        implements CountElementsWithStrictlySmallerAndGreaterElements {
    @Override
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int output = nums.length;
        for (int n: nums) {
            if (n == nums[0] || n == nums[nums.length - 1]) {
                output--;
            }
        }
        return output;
    }
}
