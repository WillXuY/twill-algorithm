package leetcode.p0900_0999.p0976_largest_perimeter_triangle;

public interface LargestPerimeterTriangle {
    /**
     * Given an integer array nums, return the largest perimeter of a
     * triangle with a non-zero area, formed from three of these
     * lengths. If it is impossible to form any triangle of a non-zero
     * area, return 0.
     *
     * @param nums 3 <= nums.length <= 10^4
     *             1 <= nums[i] <= 10^6
     * @return largest perimeter of a exit triangle composed of nums.
     */
    int largestPerimeter(int[] nums);
}
