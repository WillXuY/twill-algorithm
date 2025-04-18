package leetcode.p2400_2499.p2460_apply_operations_to_an_array;

public class ApplyOperationsToAnArrayLoop implements ApplyOperationsToAnArray {
    @Override
    public int[] applyOperations(int[] nums) {
        int[] output = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i == nums.length - 1) {
                    output[index] = nums[i];
                } else if (nums[i] == nums[i + 1]) {
                    output[index] = nums[i] * 2;
                    i++;
                } else {
                    output[index] = nums[i];
                }
                index++;
            }
        }
        return output;
    }
}
