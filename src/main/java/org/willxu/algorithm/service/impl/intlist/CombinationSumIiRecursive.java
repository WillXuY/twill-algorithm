package org.willxu.algorithm.service.impl.intlist;

import org.willxu.algorithm.service.intlist.CombinationSumIi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CombinationSumIiRecursive implements CombinationSumIi {
    @Override
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(candidates);
        for (int i = 0; i < len; i++) {
            if (candidates[i] > target) {
                break;
            } else if (candidates[i] == target) {
                List<Integer> sub = new ArrayList<>();
                sub.add(candidates[i]);
                output.add(sub);
                continue;
            }
            int[] subArray = Arrays.copyOfRange(candidates, i + 1, len);
            int diff = target - candidates[i];
            List<List<Integer>> subList = combinationSum2(subArray, diff);
            for (List<Integer> s: subList) {
                s.add(0, candidates[i]);
                output.add(s);
            }
        }
        return output.stream().distinct().collect(Collectors.toList());
    }
}
