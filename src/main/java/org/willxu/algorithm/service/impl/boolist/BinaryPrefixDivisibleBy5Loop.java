package org.willxu.algorithm.service.impl.boolist;

import org.willxu.algorithm.service.boolist.BinaryPrefixDivisibleBy5;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleBy5Loop implements BinaryPrefixDivisibleBy5 {
    /**
     * 1. Save the last 3 bit, compare with 1, 0, 1
     * 2. Check first bit is 0.
     *
     * @param nums 1 <= nums.length <= 10^5
     *             nums[i] is either 0 or 1.
     * @return check remainder.
     */
    @Override
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> output = new ArrayList<>();
        BigInteger sum = new BigInteger("0");
        for (int num : nums) {
            sum = sum.add(BigInteger.valueOf(num));
            output.add(new BigInteger("0")
                    .equals(sum.mod(BigInteger.valueOf(5))));
            sum = sum.multiply(BigInteger.valueOf(2));

        }
        return output;
    }
}
