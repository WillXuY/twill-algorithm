package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.RemoveDuplicatesFromSortedArrayIi;

public class RemoveDuplicatesFromSortedArrayIiIndex
        implements RemoveDuplicatesFromSortedArrayIi {
    @Override
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int count = 1;
        int lastNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == lastNum) {
                if (count < 2) {
                    nums[index] = nums[i];
                    index++;
                    count++;
                }
            } else {
                nums[index] = nums[i];
                index++;
                count = 1;
                lastNum = nums[i];
            }
        }
        return index;
    }
}
