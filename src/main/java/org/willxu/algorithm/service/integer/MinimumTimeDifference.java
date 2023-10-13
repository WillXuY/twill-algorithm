package org.willxu.algorithm.service.integer;

import java.util.List;

public interface MinimumTimeDifference {
    /**
     * Given a list of 24-hour clock time points in "HH:MM" format,
     * return the minimum minutes difference between any two time-points
     * in the list.
     *
     * @param timePoints 2 <= timePoints.length <= 2 * 10^4
     *                   timePoints[i] is in the format "HH:MM".
     */
    int findMinDifference(List<String> timePoints);
}
