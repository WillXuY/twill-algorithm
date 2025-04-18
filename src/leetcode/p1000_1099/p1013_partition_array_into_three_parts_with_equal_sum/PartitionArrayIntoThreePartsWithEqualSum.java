package leetcode.p1000_1099.p1013_partition_array_into_three_parts_with_equal_sum;

public interface PartitionArrayIntoThreePartsWithEqualSum {
    /**
     * Given an array of integers arr, return true if we can partition
     * the array into three non-empty parts with equal sums.
     * Formally, we can partition the array if we can find indexes
     * i + 1 < j with (arr[0] + arr[1] + ... + arr[i] == arr[i + 1]
     * + arr[i + 2] + ... + arr[j - 1] == arr[j] + arr[j + 1] + ...
     * + arr[arr.length - 1])
     *
     * @param arr 3 <= arr.length <= 5 * 10^4
     *            -10^4 <= arr[i] <= 10^4
     * @return can arr can be partitioned into three equal sum parts.
     */
    boolean canThreePartsEqualSum(int[] arr);
}
