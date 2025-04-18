package leetcode.p0900_0999.p0997_find_the_town_judge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindTheTownJudgeSet implements FindTheTownJudge {
    /**
     * 1. Save the first trust (won't be judge)
     * 2. Save the second trust (may be judge)
     * 3. Compare two set.
     *
     * @param n 1 <= n <= 1000
     * @param trust 0 <= trust.length <= 10^4
     *              trust[i].length == 2
     *              All the pairs of trust are unique.
     *              a_i != b_i
     *              1 <= a_i, b_i <= n
     * @return the possible one.
     */
    @Override
    public int findJudge(int n, int[][] trust) {
        if (n == 1) {
            return 1;
        }
        Set<Integer> impossibleSet = new HashSet<>();
        Map<Integer, Integer> possibleMap = new HashMap<>();
        for (int[] ints: trust) {
            impossibleSet.add(ints[0]);
            if (possibleMap.containsKey(ints[1])) {
                possibleMap.put(ints[1], possibleMap.get(ints[1]) + 1);
            } else {
                possibleMap.put(ints[1], 1);
            }
        }
        for (Integer k: possibleMap.keySet()) {
            if (impossibleSet.contains(k)) {
                continue;
            }
            if (possibleMap.get(k) == n - 1) {
                return k;
            }
        }
        return -1;
    }
}
