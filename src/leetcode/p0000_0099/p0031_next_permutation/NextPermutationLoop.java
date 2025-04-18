package leetcode.p0000_0099.p0031_next_permutation;

import java.util.Arrays;

public class NextPermutationLoop implements NextPermutation {
    @Override
    public void nextPermutation(int[] nums) {
        int firstDecreasing = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                firstDecreasing = i - 1;
                break;
            }
            if (i == 1) {
                Arrays.sort(nums);
                return;
            }
        }
        int exchange = 0;
        for (int i = firstDecreasing + 1; i < nums.length; i++) {
            if (nums[i] <= nums[firstDecreasing]) {
                exchange = i - 1;
                break;
            }
            if (i == nums.length - 1) {
                exchange = nums.length - 1;
            }
        }
        if (firstDecreasing == exchange) {
            return;
        }
        nums[firstDecreasing] = nums[firstDecreasing] ^ nums[exchange];
        nums[exchange] = nums[firstDecreasing] ^ nums[exchange];
        nums[firstDecreasing] = nums[firstDecreasing] ^ nums[exchange];
        int order = firstDecreasing + 1;
        int last = nums.length - 1;
        while (order < last) {
            nums[order] = nums[order] ^ nums[last];
            nums[last] = nums[order] ^ nums[last];
            nums[order] = nums[order] ^ nums[last];
            order++;
            last--;
        }
    }
}
