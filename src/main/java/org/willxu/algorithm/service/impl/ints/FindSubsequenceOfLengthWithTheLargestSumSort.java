package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.FindSubsequenceOfLengthWithTheLargestSum;

import java.util.Arrays;

public class FindSubsequenceOfLengthWithTheLargestSumSort
        implements FindSubsequenceOfLengthWithTheLargestSum {
    @Override
    public int[] maxSubsequence(int[] nums, int k) {
        int[] maxIndexes = new int[k];
        Arrays.fill(maxIndexes, -1);
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            for (int j = 0; j < maxIndexes.length; j++) {
                int index = maxIndexes[j];
                if (index == -1 || n > nums[index]) {
                    System.arraycopy(maxIndexes, j, maxIndexes,
                            j + 1, k - j - 1);
                    maxIndexes[j] = i;
                    break;
                }
            }
        }
        Arrays.sort(maxIndexes);
        int[] output = new int[k];
        for (int i = 0; i < k; i++) {
            output[i] = nums[maxIndexes[i]];
        }
        return output;
    }
}
