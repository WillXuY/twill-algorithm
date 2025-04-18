package leetcode.p0600_0699.p0658_findk_closest_elements;

import java.util.List;

public interface FindkClosestElements {
    /**
     * Given a sorted integer array arr, two integers k and x, return
     * the k closest integers to x in the array. The result should also
     * be sorted in ascending order.
     * <p>
     * An integer a is closer to x than an integer b if:
     * <p>
     * |a - x| < |b - x|, or
     * |a - x| == |b - x| and a < b
     *
     * @param arr,k 1 <= k <= arr.length
     *              1 <= arr.length <= 10^4
     *              arr is sorted in ascending order.
     * @param x -10^4 <= arr[i], x <= 10^4
     */
    List<Integer> findClosestElements(int[] arr, int k, int x);
}
