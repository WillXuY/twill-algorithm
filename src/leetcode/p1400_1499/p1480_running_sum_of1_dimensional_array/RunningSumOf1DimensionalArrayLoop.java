package leetcode.p1400_1499.p1480_running_sum_of1_dimensional_array;

public class RunningSumOf1DimensionalArrayLoop
        implements RunningSumOf1DimensionalArray {
    @Override
    public int[] runningSum(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            output[i] = output[i - 1] + nums[i];
        }
        return output;
    }
}
