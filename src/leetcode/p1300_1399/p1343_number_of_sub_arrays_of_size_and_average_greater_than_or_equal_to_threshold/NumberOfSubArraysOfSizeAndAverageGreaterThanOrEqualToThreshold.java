package leetcode.p1300_1399.p1343_number_of_sub_arrays_of_size_and_average_greater_than_or_equal_to_threshold;

public interface NumberOfSubArraysOfSizeAndAverageGreaterThanOrEqualToThreshold {
    /**
     * Given an array of integers arr and two integers k and threshold,
     * return the number of sub-arrays of size k and average greater
     * than or equal to threshold.
     *
     * @param arr 1 <= arr.length <= 10^5
     *            1 <= arr[i] <= 10^4
     * @param k 1 <= k <= arr.length
     * @param threshold 0 <= threshold <= 10^4
     */
    int numOfSubarrays(int[] arr, int k, int threshold);
}
