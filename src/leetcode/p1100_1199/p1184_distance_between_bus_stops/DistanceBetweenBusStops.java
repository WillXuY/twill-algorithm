package leetcode.p1100_1199.p1184_distance_between_bus_stops;

public interface DistanceBetweenBusStops {
    /**
     * A bus has n stops numbered from 0 to n - 1 that form a circle.
     * We know the distance between all pairs of neighboring stops where
     * distance[i] is the distance between the stops number i and
     * (i + 1) % n.
     * The bus goes along both directions i.e. clockwise and
     * counterclockwise.
     * Return the shortest distance between the given start and
     * destination stops.
     *
     * Constraints:
     * 1 <= n <= 10^4
     *
     * @param distance distance.length == n
     *                 0 <= distance[i] <= 10^4
     * @param start 0 <= start < n
     * @param destination 0 <= destination < n
     * @return min distance between bus stops.
     */
    int distanceBetweenBusStops(int[] distance, int start, int destination);
}
