package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.IntersectionOfTwoArraysIi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionOfTwoArraysIiRemove
        implements IntersectionOfTwoArraysIi {
    @Override
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = Arrays.stream(nums1).boxed()
                .collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        for (Integer i: nums2) {
            int firstIndex = list1.indexOf(i);
            if (firstIndex >= 0) {
                list1.remove(firstIndex);
                result.add(i);
            }
            if (list1.size() == 0) {
                break;
            }
        }
        int[] output = new int[result.size()];
        int index = 0;
        for (Integer i: result) {
            output[index] = i;
            index++;
        }
        return output;
    }
}
