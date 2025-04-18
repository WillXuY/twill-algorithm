package leetcode.p1400_1499.p1413_minimum_value_to_get_positive_step_by_step_sum;

public class MinimumValueToGetPositiveStepByStepSumMin
        implements MinimumValueToGetPositiveStepByStepSum {
    @Override
    public int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int n: nums) {
            count += n;
            min = Math.min(min, count);
        }
        return Math.max(1, 1 - min);
    }
}
