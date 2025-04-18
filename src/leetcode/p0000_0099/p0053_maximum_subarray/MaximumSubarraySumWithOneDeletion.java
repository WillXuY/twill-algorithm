package leetcode.p0000_0099.p0053_maximum_subarray;

public interface MaximumSubarraySumWithOneDeletion {
    /**
     * Given an array of integers, return the maximum sum for a
     * non-empty subarray (contiguous elements) with at most one element
     * deletion. In other words, you want to choose a subarray and
     * optionally delete one element from it so that there is still at
     * least one element left and the sum of the remaining elements is
     * maximum possible.
     * <p>
     * Note that the subarray needs to be non-empty after deleting one
     * element.
     *
     * @param arr 1 <= arr.length <= 10^5
     *            -10^4 <= arr[i] <= 10^4
     */
    int maximumSum(int[] arr);
}
