package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.ContainerWithMostWater;

public class ContainerWithMostWaterPointer implements ContainerWithMostWater {
    @Override
    public int maxArea(int[] height) {
        int output = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        while (leftPointer < rightPointer) {
            int left = height[leftPointer];
            int right = height[rightPointer];
            int area = Math.min(left, right) * (rightPointer - leftPointer);
            if (area > output) {
                output = area;
            }
            if (left < right) {
                leftPointer++;
            } else if (left > right) {
                rightPointer--;
            } else {
                int leftIn = height[leftPointer + 1];
                int rightIn = height[rightPointer - 1];
                if (leftIn < rightIn) {
                    rightPointer--;
                } else {
                    leftPointer++;
                }
            }
        }
        return output;
    }
}
