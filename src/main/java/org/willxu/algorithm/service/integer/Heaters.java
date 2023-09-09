package org.willxu.algorithm.service.integer;

public interface Heaters {
    /**
     * Winter is coming! During the contest, your first job is to
     * design a standard heater with a fixed warm radius to warm all the
     * houses.
     * <p>
     * Every house can be warmed, as long as the house is within the
     * heater's warm radius range.
     * <p>
     * Given the positions of houses and heaters on a horizontal line,
     * return the minimum radius standard of heaters so that those
     * heaters could cover all houses.
     * <p>
     * Notice that all the heaters follow your radius standard, and the
     * warm radius will the same.
     *
     * @param houses,heaters 1 <= houses.length, heaters.length <= 3 * 10^4
     *                       1 <= houses[i], heaters[i] <= 10^9
     */
    int findRadius(int[] houses, int[] heaters);
}
