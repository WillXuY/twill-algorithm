package leetcode.p0000_0099.p0077_combinations;

import java.util.List;

public interface Combinations {
    /**
     * Given two integers n and k, return all possible combinations of k
     * numbers chosen from the range [1, n].
     * <p>
     * You may return the answer in any order.
     *
     * @param n 1 <= n <= 20
     * @param k 1 <= k <= n
     */
    List<List<Integer>> combine(int n, int k);
}
