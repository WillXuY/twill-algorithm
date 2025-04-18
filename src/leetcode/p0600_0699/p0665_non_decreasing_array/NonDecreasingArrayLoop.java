package leetcode.p0600_0699.p0665_non_decreasing_array;

public class NonDecreasingArrayLoop implements NonDecreasingArray {
    @Override
    public boolean checkPossibility(int[] nums) {
        int decreasingCount = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                decreasingCount++;
                if (i >= 2 && nums[i - 2] > nums[i]) {
                    decreasingCount++;
                    if (i + 1 >= nums.length || nums[i - 1] <= nums[i + 1]) {
                        decreasingCount--;
                    }
                }
            }
        }
        return decreasingCount < 2;
    }
}
