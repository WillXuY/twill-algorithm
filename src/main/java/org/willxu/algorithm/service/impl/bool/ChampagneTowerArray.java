package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.ChampagneTower;

public class ChampagneTowerArray implements ChampagneTower {
    @Override
    public double champagneTower(int poured, int query_row, int query_glass) {
        int maxSize = 102;
        double[][] tower = new double[maxSize][maxSize];
        tower[0][0] = poured;
        for (int r = 0; r <= query_row; r++) {
            for (int c = 0; c <= r; c++) {
                double fall = (tower[r][c] - 1) / 2;
                if (fall > 0) {
                    tower[r + 1][c] += fall;
                    tower[r + 1][c + 1] += fall;
                }
            }
        }
        return Math.min(1, tower[query_row][query_glass]);
    }
}
