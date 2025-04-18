package leetcode.p1300_1399.p1389_create_target_array_in_the_given_order;

public interface CreateTargetArrayInTheGivenOrder {
    /**
     * Given two arrays of integers nums and index. Your task is to
     * create target array under the following rules:
     * - Initially target array is empty.
     * - From left to right read nums[i] and index[i], insert at index
     *   index[i] the value nums[i] in target array.
     * - Repeat the previous step until there are no elements to read in
     *   nums and index.
     * Return the target array.
     * It is guaranteed that the insertion operations will be valid.
     *
     * @param nums 1 <= nums.length <= 100
     *             nums.length == index.length
     *             0 <= nums[i] <= 100
     * @param index 1 <= index.length <= 100
     *              0 <= index[i] <= i
     * @return create the array insert at index.
     */
    int[] createTargetArray(int[] nums, int[] index);
}
