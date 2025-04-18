package leetcode.p1900_1999.p1909_remove_one_element_to_make_the_array_strictly_increasing;

public class RemoveOneElementToMakeTheArrayStrictlyIncreasingLoop
        implements RemoveOneElementToMakeTheArrayStrictlyIncreasing {
    @Override
    public boolean canBeIncreasing(int[] nums) {
        boolean hasDecreased = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                if (hasDecreased) {
                    return false;
                } else if (i > 1 && nums[i] <= nums[i - 2]
                        && i < nums.length - 1 && nums[i + 1] <= nums[i - 1]) {
                    return false;
                } else {
                    hasDecreased = true;
                }
            }
        }
        return true;
    }
}
