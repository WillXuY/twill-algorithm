package org.willxu.algorithm.domain.other;

/**
 * You have a RecentCounter class which counts the number of recent
 * requests within a certain time frame.
 * Implement the RecentCounter class:
 * It is guaranteed that every call to ping uses a strictly larger value
 * of t than the previous call.
 */
public abstract class AbstractNumberOfRecentCalls {
    /**
     * Initializes the counter with zero recent requests.
     */
    public AbstractNumberOfRecentCalls() {}

    /**
     * Adds a new request at time t, where t represents some time in
     * milliseconds, and returns the number of requests that has
     * happened in the past 3000 milliseconds (including the new
     * request). Specifically, return the number of requests that have
     * happened in the inclusive range [t - 3000, t].
     *
     * @param t request time.
     *          1 <= t <= 10^9
     * @return count of request times.
     */
    public abstract int ping(int t);
}
