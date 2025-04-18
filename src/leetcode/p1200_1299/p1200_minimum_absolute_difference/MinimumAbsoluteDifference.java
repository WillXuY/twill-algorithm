package leetcode.p1200_1299.p1200_minimum_absolute_difference;

import java.util.List;

public interface MinimumAbsoluteDifference {
    /**
     * Given an array of distinct integers arr, find all pairs of
     * elements with the minimum absolute difference of any two
     * elements.
     * Return a list of pairs in ascending order(with respect to pairs),
     * each pair [a, b] follows
     * - a, b are from arr
     * - a < b
     * - b - a equals to the minimum absolute difference of any two
     *   elements in arr.
     *
     * @param arr 2 <= arr.length <= 10^5
     *            -10^6 <= arr[i] <= 10^6
     * @return min abs difference between two number.
     */
    List<List<Integer>> minimumAbsDifference(int[] arr);
}
