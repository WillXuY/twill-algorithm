package org.willxu.algorithm.service.impl.intlist;

import org.willxu.algorithm.service.intlist.CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumRecursive implements CombinationSum {
    @Override
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> output = new ArrayList<>();
        for (int c: candidates) {
            int diff = target - c;
            if (diff < 0) {
                continue;
            } else if (diff == 0) {
                List<Integer> o = new ArrayList<>();
                o.add(c);
                output.add(o);
                continue;
            }
            List<List<Integer>> subList = combinationSum(candidates, diff);
            for (List<Integer> s: subList) {
                if (c <= s.get(0)) {
                    s.add(0, c);
                    output.add(s);
                }
            }
        }
        return output;
    }
}
