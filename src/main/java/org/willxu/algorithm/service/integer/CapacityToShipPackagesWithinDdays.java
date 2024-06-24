package org.willxu.algorithm.service.integer;

public interface CapacityToShipPackagesWithinDdays {
    /**
     * A conveyor belt has packages that must be shipped from one port
     * to another within days days.
     * <p>
     * The i^th package on the conveyor belt has a weight of weights[i].
     * Each day, we load the ship with packages on the conveyor belt (in
     * the order given by weights). We may not load more weight than the
     * maximum weight capacity of the ship.
     * <p>
     * Return the least weight capacity of the ship that will result in
     * all the packages on the conveyor belt being shipped within days
     * days.
     *
     * @param weights,days 1 <= days <= weights.length <= 5 * 10^4
     *                     1 <= weights[i] <= 500
     */
    int shipWithinDays(int[] weights, int days);
}
