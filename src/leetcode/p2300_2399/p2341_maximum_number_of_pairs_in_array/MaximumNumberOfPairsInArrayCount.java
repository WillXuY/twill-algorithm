package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.MaximumNumberOfPairsInArray;

import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfPairsInArrayCount
        implements MaximumNumberOfPairsInArray {
    @Override
    public int[] numberOfPairs(int[] nums) {
        int[] output = new int[2];
        Set<Integer> count = new HashSet<>();
        for (int n: nums) {
            if (count.contains(n)) {
                count.remove(n);
                output[0]++;
            } else {
                count.add(n);
            }
        }
        output[1] = count.size();
        return output;
    }
}
