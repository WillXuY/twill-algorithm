package leetcode.p1300_1399.p1331_rank_transform_of_an_array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransformOfAnArrayMap implements RankTransformOfAnArray {
    @Override
    public int[] arrayRankTransform(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        Map<Integer, Integer> sortMap = new HashMap<>();
        int rank = 1;
        for (int c: clone) {
            if (!sortMap.containsKey(c)) {
                sortMap.put(c, rank);
                rank++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            clone[i] = sortMap.get(arr[i]);
        }
        return clone;
    }
}
