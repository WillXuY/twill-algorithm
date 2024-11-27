package org.willxu.algorithm.service.integer;

public interface MaximumNumberOfEventsThatCanBeAttended {
    /**
     * You are given an array of events where
     * events[i] = [startDay_i, endDay_i]. Every event i starts at
     * startDay_i and ends at endDay_i.
     * <p>
     * You can attend an event i at any day d where
     * startTime_i <= d <= endTime_i. You can only attend one event at
     * any time d.
     * <p>
     * Return the maximum number of events you can attend.
     *
     * @param events 1 <= events.length <= 10^5
     *               events[i].length == 2
     *               1 <= startDay_i <= endDay_i <= 10^5
     */
    int maxEvents(int[][] events);
}
