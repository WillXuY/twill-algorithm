package leetcode.p2000_2099.p2006_count_number_of_pairs_with_absolute_difference;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class CountNumberOfPairsWithAbsoluteDifferenceCount
        implements CountNumberOfPairsWithAbsoluteDifference {
    @Override
    public int countKDifference(int[] nums, int k) {
        TreeMap<Integer, Integer> orderedCount = new TreeMap<>();
        for (int n: nums) {
            if (orderedCount.containsKey(n)) {
                orderedCount.put(n, orderedCount.get(n) + 1);
            } else {
                orderedCount.put(n, 1);
            }
        }
        int output = 0;
        List<Integer> numberList = new ArrayList<>(orderedCount.keySet());
        for (int i = 0; i < numberList.size(); i++) {
            for (int j = i + 1; j < numberList.size(); j++) {
                int first = numberList.get(i);
                int second = numberList.get(j);
                if (second - first == k) {
                    output += orderedCount.get(first)
                            * orderedCount.get(second);
                } else if (second - first > k) {
                    break;
                }
            }
        }
        return output;
    }
}
