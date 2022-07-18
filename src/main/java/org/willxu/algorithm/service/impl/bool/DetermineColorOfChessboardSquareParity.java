package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.DetermineColorOfChessboardSquare;

public class DetermineColorOfChessboardSquareParity
        implements DetermineColorOfChessboardSquare {
    @Override
    public boolean squareIsWhite(String coordinates) {
        char[] chars = coordinates.toCharArray();
        return ((chars[0] + chars[1]) & 1) == 1;
    }
}
