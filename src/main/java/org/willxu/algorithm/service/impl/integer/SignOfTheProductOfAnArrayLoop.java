package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.SignOfTheProductOfAnArray;

public class SignOfTheProductOfAnArrayLoop
        implements SignOfTheProductOfAnArray {
    @Override
    public int arraySign(int[] nums) {
        int output = 1;
        for (int n: nums) {
            if (n == 0) {
                return 0;
            } else if (n < 0) {
                output *= -1;
            }
        }
        return output;
    }
}
