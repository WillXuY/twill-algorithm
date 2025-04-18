package leetcode.p0600_0699.p0670_maximum_swap;

import java.util.*;

public class MaximumSwapMap implements MaximumSwap {
    @Override
    public int maximumSwap(int num) {
        List<Integer> numList = new ArrayList<>();
        while (num > 0) {
            int remain = num % 10;
            numList.add(0, remain);
            num /= 10;
        }
        Map<Integer, Integer> lastValueIndexMap = new TreeMap<>(
                Collections.reverseOrder());
        for (int i = 0; i < numList.size(); i++) {
            int val = numList.get(i);
            lastValueIndexMap.put(val, i);
        }
        Iterator<Integer> iterator = lastValueIndexMap.keySet().iterator();
        int max = iterator.next();
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) >= max) {
                while (lastValueIndexMap.get(max) <= i) {
                    if (!iterator.hasNext()) {
                        i = numList.size();
                        break;
                    }
                    max = iterator.next();
                }
                continue;
            }
            int maxIndex = lastValueIndexMap.get(max);
            int swap = numList.get(i);
            numList.set(i, max);
            numList.set(maxIndex, swap);
            break;
        }
        int result = 0;
        for (Integer n : numList) {
            result *= 10;
            result += n;
        }
        return result;
    }
}
