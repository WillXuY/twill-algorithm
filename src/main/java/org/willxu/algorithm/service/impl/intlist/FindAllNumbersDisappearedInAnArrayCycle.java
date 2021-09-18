package org.willxu.algorithm.service.impl.intlist;

import org.willxu.algorithm.service.intlist.FindAllNumbersDisappearedInAnArray;

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
