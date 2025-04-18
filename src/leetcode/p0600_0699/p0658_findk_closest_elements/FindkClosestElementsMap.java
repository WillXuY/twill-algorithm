package leetcode.p0600_0699.p0658_findk_closest_elements;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class FindkClosestElementsMap implements FindkClosestElements {
    @Override
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        TreeMap<Integer, List<Integer>> absNumListMap = new TreeMap<>();
        for (int a: arr) {
            int abs = Math.abs(x - a);
            if (absNumListMap.containsKey(abs)) {
                absNumListMap.get(abs).add(a);
            } else {
                List<Integer> numList = new ArrayList<>();
                numList.add(a);
                absNumListMap.put(abs, numList);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int key: absNumListMap.keySet()) {
            List<Integer> numList = absNumListMap.get(key);
            int count = numList.size();
            if (count <= k) {
                result.addAll(numList);
            } else {
                result.addAll(numList.subList(0, k));
            }
            k -= count;
            if (k < 1) {
                break;
            }
        }
        return result.stream().sorted().toList();
    }
}
