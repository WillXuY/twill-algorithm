package org.willxu.algorithm.service.impl.intlist;

import org.willxu.algorithm.service.intlist.FindTheDifferenceOfTwoArrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArraysRemove
        implements FindTheDifferenceOfTwoArrays {
    @Override
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = getSet(nums1);
        Set<Integer> set2 = getSet(nums2);
        List<Integer> list1 = new ArrayList<>(set1);
        list1.removeAll(set2);
        List<Integer> list2 = new ArrayList<>(set2);
        list2.removeAll(set1);
        List<List<Integer>> output = new ArrayList<>();
        output.add(list1);
        output.add(list2);
        return output;
    }

    private Set<Integer> getSet(int[] nums) {
        Set<Integer> output = new HashSet<>();
        for (int n: nums) {
            output.add(n);
        }
        return output;
    }
}
