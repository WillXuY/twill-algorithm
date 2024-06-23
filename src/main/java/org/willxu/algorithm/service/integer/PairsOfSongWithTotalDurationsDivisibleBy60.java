package org.willxu.algorithm.service.integer;

public interface PairsOfSongWithTotalDurationsDivisibleBy60 {
    /**
     * You are given a list of songs where the ith song has a duration
     * of time[i] seconds.
     * <p>
     * Return the number of pairs of songs for which their total
     * duration in seconds is divisible by 60. Formally, we want the
     * number of indices i, j such that i < j with
     * (time[i] + time[j]) % 60 == 0.
     *
     * @param time 1 <= time.length <= 6 * 10^4
     *             1 <= time[i] <= 500
     */
    int numPairsDivisibleBy60(int[] time);
}
