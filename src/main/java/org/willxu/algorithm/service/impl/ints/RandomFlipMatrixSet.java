package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.RandomFlipMatrix;

import java.util.*;

public class RandomFlipMatrixSet implements RandomFlipMatrix {
    Set<int[]> originSet;

    Set<int[]> remainSet;

    public RandomFlipMatrixSet(int m, int n) {
        originSet = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int[] pair = new int[] {i, j};
                originSet.add(pair);
            }
        }
        remainSet = new HashSet<>(originSet);
    }

    @Override
    public int[] flip() {
        List<int[]> list = new ArrayList<>(remainSet);
        Random random = new Random();
        int index = random.nextInt(list.size());
        int[] result = list.get(index);
        remainSet.remove(result);
        return result;
    }

    @Override
    public void reset() {
        remainSet = new HashSet<>(originSet);
    }
}
