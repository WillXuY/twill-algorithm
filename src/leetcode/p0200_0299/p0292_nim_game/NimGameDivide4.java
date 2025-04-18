package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.NimGame;

public class NimGameDivide4 implements NimGame {
    @Override
    public boolean canWinNim(int n) {
        return (n & 3) != 0;
    }
}
