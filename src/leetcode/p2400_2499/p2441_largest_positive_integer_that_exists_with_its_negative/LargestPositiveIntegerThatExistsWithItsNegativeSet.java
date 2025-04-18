package leetcode.p2400_2499.p2441_largest_positive_integer_that_exists_with_its_negative;

import java.util.HashSet;
import java.util.Set;

public class LargestPositiveIntegerThatExistsWithItsNegativeSet
        implements LargestPositiveIntegerThatExistsWithItsNegative {
    @Override
    public int findMaxK(int[] nums) {
        Set<Integer> exist = new HashSet<>();
        int output = -1;
        for (int n: nums) {
            if (exist.contains(-n) && Math.abs(n) > output) {
                output = Math.abs(n);
            }
            exist.add(n);
        }
        return output;
    }
}
