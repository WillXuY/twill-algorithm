package org.willxu.algorithm.service.bool;

public interface WaterAndJugProblem {
    /**
     * You are given two jugs with capacities jug1Capacity and
     * jug2Capacity liters. There is an infinite amount of water supply
     * available. Determine whether it is possible to measure exactly
     * targetCapacity liters using these two jugs.
     * <p>
     * If targetCapacity liters of water are measurable, you must have
     * targetCapacity liters of water contained within one or both
     * buckets by the end.
     * <p>
     * Operations allowed:
     * <p>
     * - Fill any of the jugs with water.
     * - Empty any of the jugs.
     * - Pour water from one jug into another till the other jug is
     *   completely full, or the first jug itself is empty.
     *
     * @param jug1Capacity,jug2Capacity,targetCapacity
     *        1 <= jug1Capacity, jug2Capacity, targetCapacity <= 10^6
     */
    boolean canMeasureWater(
            int jug1Capacity, int jug2Capacity, int targetCapacity);
}
