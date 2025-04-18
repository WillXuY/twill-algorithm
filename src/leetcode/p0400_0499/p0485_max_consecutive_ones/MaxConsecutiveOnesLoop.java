package leetcode.p0400_0499.p0485_max_consecutive_ones;

public class MaxConsecutiveOnesLoop implements MaxConsecutiveOnes {
    @Override
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int length = 0;
        for (int i: nums) {
            if (i == 1) {
                length++;
            } else {
                length = 0;
            }
            if (length > max) {
                max = length;
            }
        }
        return max;
    }
}
