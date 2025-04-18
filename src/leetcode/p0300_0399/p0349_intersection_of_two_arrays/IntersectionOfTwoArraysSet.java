package leetcode.p0300_0399.p0349_intersection_of_two_arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoArraysSet implements IntersectionOfTwoArrays {
    @Override
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed()
                .collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed()
                .collect(Collectors.toSet());
        set1.retainAll(set2);
        int[] result = new int[set1.size()];
        int index = 0;
        for (Integer i: set1) {
            result[index] = i;
            index++;
        }
        return result;
    }
}
