package leetcode.p1000_1099.p1013_partition_array_into_three_parts_with_equal_sum;

import java.util.HashSet;
import java.util.Set;

public class PartitionArrayIntoThreePartsWithEqualSumSave
        implements PartitionArrayIntoThreePartsWithEqualSum {
    /**
     * 1. Calculate the sum of arr.
     * 2. Save all the sum of split by loop.
     *
     * @param arr 3 <= arr.length <= 5 * 10^4
     *            -10^4 <= arr[i] <= 10^4
     * @return exist the three parts in map.
     */
    @Override
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int a: arr) {
            sum += a;
        }
        // [start, end) [0, 1) [1, 3) [3, end)
        Set<Integer> splitSum = new HashSet<>();
        int frontSum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            frontSum += arr[i];
            if (frontSum * 3 == sum * 2) {
                int last = sum - frontSum;
                if (splitSum.contains(last)) {
                    return true;
                }
            }
            splitSum.add(frontSum);
        }
        return false;
    }
}
