package leetcode.p1800_1899.p1827_minumum_operations_to_make_the_array_increasing;

public class MinimumOperationsToMakeTheArrayIncreasingLoop
        implements MinimumOperationsToMakeTheArrayIncreasing {
    @Override
    public int minOperations(int[] nums) {
        int output = 0;
        int lastNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= lastNumber) {
                output += lastNumber - nums[i] + 1;
                lastNumber += 1;
            } else {
                lastNumber = nums[i];
            }
        }
        return output;
    }
}
