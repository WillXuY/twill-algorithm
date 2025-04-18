package leetcode.p2200_2299.p2239_find_closest_number_to_zero;

public class FindClosestNumberToZeroAbs implements FindClosestNumberToZero {
    @Override
    public int findClosestNumber(int[] nums) {
        int index = 0;
        int minAbs = Math.abs(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            int abs = Math.abs(nums[i]);
            if (abs < minAbs) {
                minAbs = abs;
                index = i;
            } else if (abs == minAbs) {
                if (nums[i] > nums[index]) {
                    index = i;
                }
            }
        }
        return nums[index];
    }
}
