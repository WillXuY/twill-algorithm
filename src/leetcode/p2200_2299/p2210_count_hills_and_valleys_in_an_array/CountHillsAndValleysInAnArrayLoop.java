package leetcode.p2200_2299.p2210_count_hills_and_valleys_in_an_array;

public class CountHillsAndValleysInAnArrayLoop
        implements CountHillsAndValleysInAnArray {
    @Override
    public int countHillValley(int[] nums) {
        int output = 0;
        boolean isRising = false;
        boolean isFalling = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                if (isFalling) {
                    output++;
                }
                isRising = true;
                isFalling = false;
            } else if (nums[i] < nums[i - 1]){
                if (isRising) {
                    output++;
                }
                isRising = false;
                isFalling = true;
            }
        }
        return output;
    }
}
