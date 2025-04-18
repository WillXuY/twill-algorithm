package leetcode.p0400_0499.p0453_minimum_moves_to_equal_array_elements;

public class MinimumMovesToEqualArrayElementsMath
        implements MinimumMovesToEqualArrayElements {
    @Override
    public int minMoves(int[] nums) {
        int min = nums[0];
        int sum = 0;
        for (int i: nums) {
            sum += i;
            if (i < min) {
                min = i;
            }
        }
        return sum - min * nums.length;
    }
}
