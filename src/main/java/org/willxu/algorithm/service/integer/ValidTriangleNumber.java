package org.willxu.algorithm.service.integer;

public interface ValidTriangleNumber {
    /**
     * Given an integer array nums, return the number of triplets chosen
     * from the array that can make triangles if we take them as side
     * lengths of a triangle.
     *
     * @param nums 1 <= nums.length <= 1000
     *             0 <= nums[i] <= 1000
     */
    int triangleNumber(int[] nums);
}
