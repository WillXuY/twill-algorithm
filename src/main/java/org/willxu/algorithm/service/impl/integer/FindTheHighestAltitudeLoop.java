package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.FindTheHighestAltitude;

public class FindTheHighestAltitudeLoop implements FindTheHighestAltitude {
    @Override
    public int largestAltitude(int[] gain) {
        int output = 0;
        int count = 0;
        for (int g: gain) {
            count += g;
            if (count > output) {
                output = count;
            }
        }
        return output;
    }
}
