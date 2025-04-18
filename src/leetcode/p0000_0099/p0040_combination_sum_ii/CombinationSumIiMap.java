package leetcode.p0000_0099.p0040_combination_sum_ii;

import java.util.*;

public class CombinationSumIiMap implements CombinationSumIi {
    @Override
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int c: candidates) {
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else {
                countMap.put(c, 1);
            }
        }
        List<int[]> countList = new ArrayList<>();
        countMap.forEach((key, value) -> countList.add(new int[] {key, value}));
        List<Integer> parent = new LinkedList<>();
        return backTrack(parent, target, 0, countList);
    }

    public List<List<Integer>> backTrack(List<Integer> parent, int remain,
                                         int currentIndex, List<int[]> count) {
        List<List<Integer>> result = new ArrayList<>();
        if (remain == 0) {
            result.add(new ArrayList<>(parent));
            return result;
        } else if (remain < 0) {
            return Collections.emptyList();
        }
        for (int i = currentIndex; i < count.size(); i++) {
            int[] entry = count.get(i);
            int key = entry[0];
            int value = entry[1];
            if (value <= 0) {
                continue;
            }
            parent.add(key);
            count.set(i, new int[] {key, value - 1});
            List<List<Integer>> subResult = backTrack(
                    parent, remain - key, i, count);
            result.addAll(subResult);
            count.set(i, new int[] {key, value});
            parent.remove(parent.size() - 1);
        }
        return result;
    }
}
