package leetcode.p2300_2399.p2367_number_of_arithmetic_triplets;

import java.util.HashSet;
import java.util.Set;

public class NumberOfArithmeticTripletsSet implements NumberOfArithmeticTriplets {
    @Override
    public int arithmeticTriplets(int[] nums, int diff) {
        int output = 0;
        Set<Integer> set = new HashSet<>();
        for (int n: nums) {
            if (set.contains(n - diff) & set.contains(n - 2 * diff)) {
                output++;
            }
            set.add(n);
        }
        return output;
    }
}
