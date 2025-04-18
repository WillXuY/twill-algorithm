package leetcode.p0900_0999.p0941_valid_mountain_array;

public interface ValidMountainArray {
    /**
     * Given an array of integers arr, return true if and only if it is
     * a valid mountain array.
     * Recall that arr is a mountain array if and only if:
     * - arr.length >= 3
     * - There exists some i with 0 < i < arr.length - 1 such that:
     *   - arr[0] < arr[1]< ... < arr[i - 1] < arr[i]
     *   - arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
     *
     * @param arr 1 <= arr.length <= 10^4
     *            0 <= arr[i] <= 10^4
     * @return is arr a valid mountain array.
     */
    boolean validMountainArray(int[] arr);
}
