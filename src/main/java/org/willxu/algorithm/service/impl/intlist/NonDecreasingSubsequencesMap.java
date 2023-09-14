package org.willxu.algorithm.service.impl.intlist;

import org.willxu.algorithm.service.intlist.NonDecreasingSubsequences;

import java.util.*;

public class NonDecreasingSubsequencesMap implements NonDecreasingSubsequences {
    @Override
    public List<List<Integer>> findSubsequences(int[] nums) {
        Map<Integer, Set<List<Integer>>> lastListMap = new HashMap<>();
        List<Integer> firstArrayList = new ArrayList<>();
        firstArrayList.add(nums[0]);
        Set<List<Integer>> firstArraySet = new HashSet<>();
        firstArraySet.add(firstArrayList);
        lastListMap.put(nums[0], firstArraySet);
        for (int i = 1; i < nums.length; i++) {
            Set<List<Integer>> thisNumsSet = new HashSet<>();
            List<Integer> list = new ArrayList<>();
            list.add(nums[i]);
            thisNumsSet.add(list);
            for (int key: lastListMap.keySet()) {
                if (key <= nums[i]) {
                    Set<List<Integer>> value = lastListMap.get(key);
                    for (List<Integer> parent: value) {
                        List<Integer> sub = new ArrayList<>(parent);
                        sub.add(nums[i]);
                        thisNumsSet.add(sub);
                    }
                }
            }
            if (lastListMap.containsKey(nums[i])) {
                lastListMap.get(nums[i]).addAll(thisNumsSet);
            } else {
                lastListMap.put(nums[i], thisNumsSet);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for (Set<List<Integer>> set: lastListMap.values()) {
            for (List<Integer> l: set) {
                if (l.size() > 1) {
                    result.add(l);
                }
            }
        }
        return result;
    }
}
