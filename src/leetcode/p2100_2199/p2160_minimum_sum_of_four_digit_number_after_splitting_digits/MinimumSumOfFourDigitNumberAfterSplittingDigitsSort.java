package leetcode.p2100_2199.p2160_minimum_sum_of_four_digit_number_after_splitting_digits;

import java.util.Arrays;

public class MinimumSumOfFourDigitNumberAfterSplittingDigitsSort
        implements MinimumSumOfFourDigitNumberAfterSplittingDigits {
    @Override
    public int minimumSum(int num) {
        int[] nums = new int[4];
        int index = 0;
        while (num > 0) {
            nums[index] = num % 10;
            num /= 10;
            index++;
        }
        Arrays.sort(nums);
        return nums[0] * 10 + nums[1] * 10 + nums[2] + nums[3];
    }
}
