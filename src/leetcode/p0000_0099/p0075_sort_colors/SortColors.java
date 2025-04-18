package leetcode.p0000_0099.p0075_sort_colors;

public interface SortColors {
    /**
     * Given an array nums with n objects colored red, white, or blue,
     * sort them in-place so that objects of the same color are
     * adjacent, with the colors in the order red, white, and blue.
     * <p>
     * We will use the integers 0, 1, and 2 to represent the color red,
     * white, and blue, respectively.
     * <p>
     * You must solve this problem without using the library's sort
     * function.
     *
     * @param nums n == nums.length
     *             1 <= n <= 300
     *             nums[i] is either 0, 1, or 2.
     */
    void sortColors(int[] nums);
}
