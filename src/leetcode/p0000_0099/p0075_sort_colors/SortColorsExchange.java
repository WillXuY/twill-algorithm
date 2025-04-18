package org.willxu.algorithm.service.impl.empty;

import org.willxu.algorithm.service.empty.SortColors;

public class SortColorsExchange implements SortColors {
    @Override
    public void sortColors(int[] nums) {
        int zeroIndex = -1;
        int twoIndex = nums.length;
        for (int i = 0; i < twoIndex; i++) {
            if (nums[i] == 0) {
                int oneIndex = zeroIndex + 1;
                while (nums[oneIndex] == 0) {
                    oneIndex++;
                    if (oneIndex >= nums.length) {
                        break;
                    }
                }
                if (oneIndex >= i) {
                    continue;
                }
                nums[i] = nums[oneIndex];
                nums[oneIndex] = 0;
                zeroIndex = oneIndex;
            } else if (nums[i] == 2) {
                int oneEndIndex = twoIndex - 1;
                // find the closest 2.
                while (nums[oneEndIndex] == 2) {
                    oneEndIndex--;
                    if (oneEndIndex < 0) {
                        break;
                    }
                }
                if (oneEndIndex <= i) {
                    break;
                }
                if (nums[oneEndIndex] == 0) {
                    int oneStartIndex = zeroIndex + 1;
                    while (nums[oneStartIndex] == 0) {
                        oneStartIndex++;
                        if (oneStartIndex >= nums.length) {
                            break;
                        }
                    }
                    if (oneStartIndex >= i) {
                        nums[i] = 0;
                        nums[oneEndIndex] = 2;
                        twoIndex = oneEndIndex;
                        continue;
                    }
                    nums[oneStartIndex] = 0;
                    zeroIndex = oneStartIndex;
                }
                nums[i] = 1;
                nums[oneEndIndex] = 2;
                twoIndex = oneEndIndex;
            }
        }
    }
}
