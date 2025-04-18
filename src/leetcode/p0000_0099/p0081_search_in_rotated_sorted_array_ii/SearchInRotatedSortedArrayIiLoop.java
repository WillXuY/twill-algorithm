package leetcode.p0000_0099.p0081_search_in_rotated_sorted_array_ii;

public class SearchInRotatedSortedArrayIiLoop
        implements SearchInRotatedSortedArrayIi {
    @Override
    public boolean search(int[] nums, int target) {
        if (target == nums[0]) {
            return true;
        } else if (target < nums[0]) {
            for (int i = nums.length - 1; i >= 0; i--) {
                if (target == nums[i]) {
                    return true;
                } else if (target > nums[i]) {
                    return false;
                } else if (i > 0 && nums[i] < nums[i - 1]) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (target == nums[i]) {
                    return true;
                } else if (target < nums[i]) {
                    return false;
                } else if (i > 0 && nums[i] < nums[i - 1]) {
                    return false;
                }
            }
        }
        return false;
    }
}
