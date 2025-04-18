package leetcode.p1700_1799.p1752_check_if_array_is_sorted_and_rotated;

public class CheckIfArrayIsSortedAndRotatedLoop
        implements CheckIfArrayIsSortedAndRotated {
    @Override
    public boolean check(int[] nums) {
        boolean hasDecreased = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                if (hasDecreased) {
                    return false;
                } else {
                    hasDecreased = true;
                }
            }
        }
        if (hasDecreased) {
            return nums[nums.length - 1] <= nums[0];
        }
        return true;
    }
}
