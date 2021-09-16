package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.ArrangingCoins;

public class ArrangingCoinsCycle implements ArrangingCoins {
    @Override
    public int arrangeCoins(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count++;
            n = n - i;
        }
        return count;
    }
}
