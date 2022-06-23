package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.NumberOfRectanglesThatCanFormTheLargestSquare;

public class NumberOfRectanglesThatCanFormTheLargestSquareLoop
        implements NumberOfRectanglesThatCanFormTheLargestSquare {
    @Override
    public int countGoodRectangles(int[][] rectangles) {
        int max = 0;
        int count = 0;
        for (int[] r: rectangles) {
            int square = Math.min(r[0], r[1]);
            if (square > max) {
                max = square;
                count = 1;
            } else if (square == max) {
                count++;
            }
        }
        return count;
    }
}
