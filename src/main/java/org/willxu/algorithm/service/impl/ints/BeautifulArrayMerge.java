package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.BeautifulArray;

import java.util.ArrayList;
import java.util.List;

public class BeautifulArrayMerge implements BeautifulArray {
    @Override
    public int[] beautifulArray(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        while (result.size() < n) {
            List<Integer> newResult = new ArrayList<>();
            // Generate odd array.
            for (Integer r : result) {
                int newOdd = r * 2 - 1;
                if (newOdd <= n) {
                    newResult.add(newOdd);
                }
            }
            for (Integer r: result) {
                int newEven = r * 2;
                if (newEven <= n) {
                    newResult.add(newEven);
                }
            }
            result = newResult;
        }
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            output[i] = result.get(i);
        }
        return output;
    }
}
