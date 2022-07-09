package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.FindNearestPointThatHasTheSameXoryCoordinate;

public class FindNearestPointThatHasTheSameXoryCoordinateLoop
        implements FindNearestPointThatHasTheSameXoryCoordinate {
    @Override
    public int nearestValidPoint(int x, int y, int[][] points) {
        int output = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            int[] p = points[i];
            if (x == p[0]) {
                int distance = Math.abs(y - p[1]);
                if (distance < min) {
                    min = distance;
                    output = i;
                }
            } else if (y == p[1]) {
                int distance = Math.abs(x - p[0]);
                if (distance < min) {
                    min = distance;
                    output = i;
                }
            }
        }
        return output;
    }
}
