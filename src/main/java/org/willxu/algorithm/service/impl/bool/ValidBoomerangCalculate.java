package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.ValidBoomerang;

public class ValidBoomerangCalculate implements ValidBoomerang {
    /**
     * Calculate the area.
     *
     * @param points points.length = 3
     *               points[i].length = 2
     *               0 <= x_i, y_i <= 100
     * @return three points' area != 0
     */
    @Override
    public boolean isBoomerang(int[][] points) {
        return 0 != points[0][0] * points[1][1] + points[1][0] * points[2][1]
                + points[2][0] * points[0][1] - points[0][0] * points[2][1]
                - points[1][0] * points[0][1] - points[2][0] * points[1][1];
    }
}
