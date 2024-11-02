package org.willxu.algorithm.service.integer;

public interface SumOfMutatedArrayClosestToTarget {
    /**
     * Given an integer array arr and a target value target, return the
     * integer value such that when we change all the integers larger
     * than value in the given array to be equal to value, the sum of
     * the array gets as close as possible (in absolute difference) to
     * target.
     * <p>
     * In case of a tie, return the minimum such integer.
     * <p>
     * Notice that the answer is not neccesarilly a number from arr.
     *
     * @param arr 1 <= arr.length <= 10^4
     * @param target 1 <= arr[i], target <= 10^5
     */
    int findBestValue(int[] arr, int target);
}
