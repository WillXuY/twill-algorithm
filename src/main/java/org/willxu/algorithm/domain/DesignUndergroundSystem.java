package org.willxu.algorithm.domain;

/**
 * An underground railway system is keeping track of customer travel
 * times between different stations. They are using this data to
 * calculate the average time it takes to travel from one station to
 * another.
 * <p>
 * Implement the UndergroundSystem class:
 * <p>
 * You may assume all calls to the checkIn and checkOut methods are
 * consistent. If a customer checks in at time t1 then checks out at
 * time t2, then t1 < t2. All events happen in chronological order.
 * <p>
 * All strings consist of uppercase and lowercase English letters and
 * digits.
 * <p>
 * There will be at most 2 * 104 calls in total to checkIn, checkOut,
 * and getAverageTime.
 * <p>
 * Answers within 10-5 of the actual value will be accepted.
 */
public interface DesignUndergroundSystem {
    /**
     * A customer with a card ID equal to id, checks in at the station
     * stationName at time t.
     * <p>
     * A customer can only be checked into one place at a time.
     *
     * @param id,t 1 <= id, t <= 10^6
     * @param stationName 1 <= stationName.length, startStation.length,
     *                    endStation.length <= 10
     */
    void checkIn(int id, String stationName, int t);

    /**
     * A customer with a card ID equal to id, checks out from the
     * station stationName at time t.
     *
     * @param id,t 1 <= id, t <= 10^6
     * @param stationName 1 <= stationName.length, startStation.length,
     *                    endStation.length <= 10
     */
    public void checkOut(int id, String stationName, int t);

    /**
     * Returns the average time it takes to travel from startStation to
     * endStation.
     * <p>
     * The average time is computed from all the previous traveling
     * times from startStation to endStation that happened directly,
     * meaning a check in at startStation followed by a check out from
     * endStation.
     * <p>
     * The time it takes to travel from startStation to endStation may
     * be different from the time it takes to travel from endStation to
     * startStation.
     * <p>
     * There will be at least one customer that has traveled from
     * startStation to endStation before getAverageTime is called.
     *
     * @param startStation,endStation 1 <= stationName.length,
     *                    startStation.length, endStation.length <= 10
     */
    public double getAverageTime(String startStation, String endStation);
}
