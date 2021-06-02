package org.willxu.algorithm.service.impl.integer;


import org.willxu.algorithm.service.integer.RemoveDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArrayBruteForce
        implements RemoveDuplicatesFromSortedArray {
    @Override
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int len = 1;
        int thisNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (thisNumber != nums[i]) {
                len++;
                thisNumber = nums[i];
                nums[len - 1] = nums[i];
            }
        }
        return len;
    }
}
