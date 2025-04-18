package leetcode.p0000_0099.p0033_search_in_rotated_sorted_array;

public class SearchInRotatedSortedArrayLoop
        implements SearchInRotatedSortedArray {
    @Override
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
