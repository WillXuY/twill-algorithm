package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.ConstructTheRectangle;

public class ConstructTheRectangleSqrt implements ConstructTheRectangle {
    @Override
    public int[] constructRectangle(int area) {
        int[] rectangle = new int[2];
        rectangle[1] = (int) Math.sqrt(area);
        while (rectangle[1] > 0) {
            if (area % rectangle[1] == 0) {
                rectangle[0] = area / rectangle[1];
                break;
            }
            rectangle[1]--;
        }
        return rectangle;
    }
}
