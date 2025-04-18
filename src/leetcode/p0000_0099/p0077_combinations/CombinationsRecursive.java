package leetcode.p0000_0099.p0077_combinations;

import java.util.ArrayList;
import java.util.List;

public class CombinationsRecursive implements Combinations {
    @Override
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (k == 1) {
            for (int i = 1; i <= n; i++) {
                List<Integer> r = new ArrayList<>();
                r.add(i);
                result.add(r);
            }
            return result;
        }
        for (int i = 1; i < n; i++) {
            List<List<Integer>> subResult = combine(n - i, k - 1);
            for (List<Integer> sub: subResult) {
                List<Integer> r = new ArrayList<>();
                r.add(i);
                for (int s: sub) {
                    r.add(s + i);
                }
                result.add(r);
            }
        }
        return result;
    }
}
