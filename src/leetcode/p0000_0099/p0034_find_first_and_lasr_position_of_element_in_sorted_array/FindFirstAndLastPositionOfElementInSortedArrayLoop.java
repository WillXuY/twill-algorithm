package leetcode.p0000_0099.p0034_find_first_and_lasr_position_of_element_in_sorted_array;

public class FindFirstAndLastPositionOfElementInSortedArrayLoop
        implements FindFirstAndLastPositionOfElementInSortedArray {
    @Override
    public int[] searchRange(int[] nums, int target) {
        int[] output = new int[] {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (output[0] == -1) {
                    output[0] = i;
                }
                if (i == nums.length - 1) {
                    output[1] = i;
                }
            } else {
                if (output[0] != -1 && nums[i - 1] == target) {
                    output[1] = i - 1;
                }
            }
        }
        return output;
    }
}
