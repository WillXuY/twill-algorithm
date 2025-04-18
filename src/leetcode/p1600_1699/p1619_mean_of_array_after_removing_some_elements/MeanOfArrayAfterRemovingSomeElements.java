package leetcode.p1600_1699.p1619_mean_of_array_after_removing_some_elements;

public interface MeanOfArrayAfterRemovingSomeElements {
    /**
     * Given an integer array arr, return the mean of the remaining
     * integers after removing the smallest 5% and the largest 5% of the
     * elements.
     *
     * Answers within 10-5 of the actual answer will be considered
     * accepted.
     *
     * @param arr 20 <= arr.length <= 1000
     *            arr.length is a multiple of 20.
     *            0 <= arr[i] <= 105
     */
    double trimMean(int[] arr);
}
