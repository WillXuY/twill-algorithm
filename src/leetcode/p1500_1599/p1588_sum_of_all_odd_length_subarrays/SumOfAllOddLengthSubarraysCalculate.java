package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.SumOfAllOddLengthSubarrays;

public class SumOfAllOddLengthSubarraysCalculate
        implements SumOfAllOddLengthSubarrays {
    /**
     * 1, 2, 3, 4, 5, 6, 7, 8   length
     * 1, 1, 1, 1, 1, 1, 1, 1   1
     * 1, 2, 3, 3, 3, 3, 2, 1   3
     * 1, 2, 3, 4, 4, 3, 2, 1   5
     * 1, 2, 2, 2, 2, 2, 2, 1   7
     *
     * 1, 2, 3, 4, 5, 6, 7, 8, 9   length
     * 1, 1, 1, 1, 1, 1, 1, 1, 1   1
     * 1, 2, 3, 3, 3, 3, 3, 2, 1   3
     * 1, 2, 3, 4, 5, 4, 3, 2, 1   5
     * 1, 2, 3, 3, 3, 3, 3, 2, 1   7
     * 1, 1, 1, 1, 1, 1, 1, 1, 1   9
     */
    @Override
    public int sumOddLengthSubarrays(int[] arr) {
        int halfLength = (arr.length + 1) / 2;
        int[] counts = new int[arr.length];
        for (int subLength = 1; subLength <= arr.length; subLength += 2) {
            int maxCount = arr.length - subLength + 1;
            maxCount = Math.min(maxCount, subLength);
            for (int i = 1; i <= halfLength; i++) {
                int add = Math.min(i, maxCount);
                counts[i - 1] += add;
                counts[arr.length - i] += add;
                if (i == halfLength && (arr.length & 1) == 1) {
                    counts[i - 1] -= add;
                }
            }
        }
        int output = 0;
        for (int i = 0; i < arr.length; i++) {
            output += arr[i] * counts[i];
        }
        return output;
    }
}
