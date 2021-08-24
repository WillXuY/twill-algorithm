package org.willxu.algorithm.service.impl.empty;

import org.willxu.algorithm.service.empty.MoveZeros;

public class MoveZerosExchange implements MoveZeros {
    /**
     * keep the order
     * @param nums 1 <= nums.length <= 10^4
     */
    @Override
    public void moveZeroes(int[] nums) {
        int indexTo = nums.length - 1;
        while (indexTo >= 0 && nums[indexTo] == 0) {
            indexTo--;
        }
        for (int i = indexTo - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                for (int j = i; j < indexTo; j++) {
                    nums[j] = nums[j] ^ nums[j + 1];
                    nums[j + 1] = nums[j] ^ nums[j + 1];
                    nums[j] = nums[j] ^ nums[j + 1];
                }
                indexTo--;
            }
        }
    }
}
