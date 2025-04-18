package leetcode.p0100_0199.p0162_find_peak_element;

public class FindPeakElementLoop implements FindPeakElement {
    @Override
    public int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return nums.length - 1;
    }
}
