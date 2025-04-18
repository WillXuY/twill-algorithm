package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.CheckIfItIsStraightLine;

public class CheckIfItIsStraightLineEquation
        implements CheckIfItIsStraightLine {
    /**
     * x + my = n
     * (a, b) = [0][0], [0][1]; (c, d) = [1][0], [1][1];
     * a + mb = n
     * c + md = n
     *
     * a + mb = c + md
     * (b - d)m = c - a
     * m = (c - a) / (b - d)
     *
     * n = a + (c - a) / (b - d) * b
     *
     * check e + mf = n
     * e + (c - a) / (b - d) * f = a + (c - a) / (b - d) * b
     *
     * (b - d) * e + (c - a) * f = (b - d) * a + (c - a) * b
     *
     * @param coordinates 2 <= coordinates.length <= 1000
     *                    coordinates[i].length == 2
     *                    -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
     *                    coordinates contains no duplicate point.
     * @return for every e = coordinates[i][0], f = coordinates[i][1]
     *         (b - d) * e + (c - a) * f = (b - d) * a + (c - a) * b
     */
    @Override
    public boolean checkStraightLine(int[][] coordinates) {
        int a = coordinates[0][0], b = coordinates[0][1];
        int c = coordinates[1][0], d = coordinates[1][1];
        for (int i = 2; i < coordinates.length; i++) {
            int left = (b - d) * coordinates[i][0]
                    + (c - a) * coordinates[i][1];
            int right = (b - d) * a + (c - a) * b;
            if (left != right) {
                return false;
            }
        }
        return true;
    }
}
