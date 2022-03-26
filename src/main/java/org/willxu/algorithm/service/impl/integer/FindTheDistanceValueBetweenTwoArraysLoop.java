package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.FindTheDistanceValueBetweenTwoArrays;

public class FindTheDistanceValueBetweenTwoArraysLoop
        implements FindTheDistanceValueBetweenTwoArrays {
    @Override
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int output = 0;
        for (int i: arr1) {
            boolean distanceValue = true;
            for (int j: arr2) {
                if (Math.abs(i - j) <= d) {
                    distanceValue = false;
                    break;
                }
            }
            if (distanceValue) {
                output++;
            }
        }
        return output;
    }
}
