package leetcode.p0800_0899.p0896_monotonic_array;

public class MonotonicArrayLoop implements MonotonicArray {

    /**
     * 1. If nums.length < 3 return true
     * 2. Define boolean increasing.(maybe all same).
     * 3. Loop and compare all the numbers.
     */
    @Override
    public boolean isMonotonic(int[] nums) {
        if (nums.length < 3) {
            return true;
        }
        boolean increasing = false;
        boolean confirmOrder = false;
        for (int i = 1; i < nums.length; i++) {
            if (confirmOrder) {
                if (increasing && nums[i] < nums[i - 1]) {
                    return false;
                } else if (!increasing && nums[i] > nums[i - 1]){
                    return false;
                }
            } else {
                if (nums[i] > nums[i - 1]) {
                    increasing = true;
                    confirmOrder = true;
                } else if (nums[i] < nums[i - 1]) {
                    confirmOrder = true;
                }
            }
        }
        return true;
    }
}
