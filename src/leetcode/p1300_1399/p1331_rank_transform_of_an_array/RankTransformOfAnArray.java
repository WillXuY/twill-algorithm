package leetcode.p1300_1399.p1331_rank_transform_of_an_array;

public interface RankTransformOfAnArray {
    /**
     * Given an array of integers arr, replace each element with its
     * rank.
     * The rank represents how large the element is. The rank has the
     * following rules:
     * - Rank is an integer starting from 1.
     * - The larger the element, the larger the rank. If two elements
     *   are equal, their rank must be the same.
     * - Rank should be as small as possible.
     *
     * @param arr 0 <= arr.length <= 10^5
     *            -10^9 <= arr[i] <= 10^9
     * @return rank array of arr.
     */
    int[] arrayRankTransform(int[] arr);
}
