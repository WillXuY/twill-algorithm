package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MinimumCostToMoveChipsToTheSamePosition;

public class MinimumCostToMoveChipsToTheSamePositionCount
        implements MinimumCostToMoveChipsToTheSamePosition {
    @Override
    public int minCostToMoveChips(int[] position) {
        int odds = 0;
        int evens = 0;
        for (int i: position) {
            if ((i & 1) == 1) {
                odds++;
            } else {
                evens++;
            }
        }
        return Math.min(odds, evens);
    }
}
