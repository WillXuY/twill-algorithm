package leetcode.p0400_0499.p0448_find_all_numbers_disappeared_in_an_array;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArrayCycle
        implements FindAllNumbersDisappearedInAnArray {
    @Override
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] contains = new boolean[nums.length];
        for (int i: nums) {
            contains[i - 1] = true;
        }
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < contains.length; i++) {
            if (!contains[i]) {
                numbers.add(i + 1);
            }
        }
        return numbers;
    }
}
