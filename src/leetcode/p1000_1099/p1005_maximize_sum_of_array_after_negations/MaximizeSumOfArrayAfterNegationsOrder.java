package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MaximizeSumOfArrayAfterNegations;

import java.util.TreeMap;

public class MaximizeSumOfArrayAfterNegationsOrder
        implements MaximizeSumOfArrayAfterNegations {
    /**
     * 1. Save the positive numbers sequentially.
     * 2. Save the negative numbers sequentially.
     * 3. Replace all negative numbers first.
     * 4. Replace k%2 the min non-negative number.
     *
     * @param nums 1 <= nums.length <= 10^4
     *             -100 <= nums[i] <= 100
     * @param k 1 <= k <= 10^4
     * @return sum after k's change.
     */
    @Override
    public int largestSumAfterKNegations(int[] nums, int k) {
        int nonNegativeMin = Integer.MAX_VALUE;
        TreeMap<Integer, Integer> negativeMap = new TreeMap<>();
        int sum = 0;
        for (int n: nums) {
            sum += n;
            if (n < 0) {
                if (negativeMap.containsKey(n)) {
                    negativeMap.put(n, negativeMap.get(n) + 1);
                } else {
                    negativeMap.put(n, 1);
                }
            } else {
                if (n < nonNegativeMin) {
                    nonNegativeMin = n;
                }
            }
        }
        while (k > 0) {
            if (negativeMap.size() <= 0) {
                break;
            }
            Integer key = negativeMap.firstKey();
            Integer value = negativeMap.get(key);
            sum -= 2 * key;
            value--;
            if (value <= 0) {
                negativeMap.remove(key);
            } else {
                negativeMap.put(key, value);
            }
            // Compare negative key with mine.
            if (key * -1 < nonNegativeMin) {
                nonNegativeMin = key * -1;
            }
            k--;
        }
        return sum - (k & 1) * nonNegativeMin * 2;
    }
}
