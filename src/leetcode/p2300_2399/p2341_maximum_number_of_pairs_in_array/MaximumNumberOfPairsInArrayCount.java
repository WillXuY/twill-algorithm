package leetcode.p2300_2399.p2341_maximum_number_of_pairs_in_array;

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
