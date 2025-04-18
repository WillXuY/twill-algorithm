package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.NextGreaterElementIii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextGreaterElementIiiLoop implements NextGreaterElementIii {
    @Override
    public int nextGreaterElement(int n) {
        List<Integer> numList = new ArrayList<>();
        int loopN = n;
        while (loopN > 0) {
            numList.add(loopN % 10);
            loopN /= 10;
        }
        for (int i = 1; i < numList.size(); i++) {
            int num = numList.get(i);
            for (int j = 0; j < i; j++) {
                if (num < numList.get(j)) {
                    numList.set(i, numList.get(j));
                    numList.set(j, num);
                    if (i > 1) {
                        Integer[] array = new Integer[i];
                        for (int k = 0; k < i; k++) {
                            array[k] = numList.get(k);
                        }
                        Arrays.sort(array, (a, b) -> b - a);
                        for (int k = 0; k < i; k++) {
                            numList.set(k, array[k]);
                        }
                    }
                    i = numList.size();
                    break;
                }
            }
        }
        long result = 0;
        for (int i = numList.size() - 1; i >= 0; i--) {
            result *= 10;
            result += numList.get(i);
        }
        if (result > Integer.MAX_VALUE) {
            return -1;
        }
        int r = (int) result;
        return r == n ? -1 : r;
    }
}
