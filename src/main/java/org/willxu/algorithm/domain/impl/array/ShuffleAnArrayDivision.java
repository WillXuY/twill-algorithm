package org.willxu.algorithm.domain.impl.array;

import org.willxu.algorithm.domain.array.SheffleAnArray;

import java.util.ArrayList;
import java.util.List;

public class ShuffleAnArrayDivision implements SheffleAnArray {
    List<Integer> original;

    List<Integer> list;

    public ShuffleAnArrayDivision(int[] nums) {
        list = new ArrayList<>();
        for (int n: nums) {
            list.add(n);
        }
        original = new ArrayList<>(list);
    }

    @Override
    public int[] reset() {
        list = new ArrayList<>(original);
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    @Override
    public int[] shuffle() {
        List<Integer> newList = new ArrayList<>();
        while (list.size() > 0) {
            int index = (int) (Math.random() * list.size());
            newList.add(list.get(index));
            list.remove(index);
        }
        list = newList;
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
