package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.NumberOfSubArraysOfSizeAndAverageGreaterThanOrEqualToThreshold;

public class NumberOfSubArraysOfSizeAndAverageGreaterThanOrEqualToThresholdLoop
        implements NumberOfSubArraysOfSizeAndAverageGreaterThanOrEqualToThreshold {
    @Override
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int goal = k * threshold;
        int result = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if (sum >= goal) {
            result += 1;
        }
        for (int i = k; i < arr.length; i++) {
            sum -= arr[i - k];
            sum += arr[i];
            if (sum >= goal) {
                result += 1;
            }
        }
        return result;
    }
}
