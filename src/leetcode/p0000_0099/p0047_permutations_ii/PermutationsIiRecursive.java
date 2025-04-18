package leetcode.p0000_0099.p0047_permutations_ii;

import java.util.*;

public class PermutationsIiRecursive implements PermutationsIi {
    @Override
    public List<List<Integer>> permuteUnique(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n: nums) {
            if (count.containsKey(n)) {
                count.put(n, count.get(n) + 1);
            } else {
                count.put(n, 1);
            }
        }
        List<int[]> countList = new ArrayList<>();
        for (int k: count.keySet()) {
            countList.add(new int[] {k, count.get(k)});
        }
        return recursive(countList);
    }

    private List<List<Integer>> recursive(List<int[]> nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.size() == 0) {
            return result;
        } else if (nums.size() == 1) {
            int[] only = nums.get(0);
            if (only[1] == 1) {
                List<Integer> r = new ArrayList<>();
                r.add(only[0]);
                result.add(r);
                return result;
            }
        }
        for (int i = 0; i < nums.size(); i++) {
            int[] n = nums.get(i);
            if (n[1] <= 0) {
                continue;
            }
            n[1]--;
            List<int[]> subNums = new ArrayList<>(nums);
            if (n[1] == 0) {
                subNums.remove(i);
            }
            List<List<Integer>> sub = recursive(subNums);
            for (List<Integer> s: sub) {
                s.add(0, n[0]);
                result.add(s);
            }
            n[1]++;
        }
        return result;
    }
}
