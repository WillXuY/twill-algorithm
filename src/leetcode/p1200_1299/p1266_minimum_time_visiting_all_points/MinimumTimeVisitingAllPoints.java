package leetcode.p1200_1299.p1266_minimum_time_visiting_all_points;

public interface MinimumTimeVisitingAllPoints {
    /**
     * On a 2D plane, there are n points with integer coordinates
     * points[i] = [x_i, y_i]. Return the minimum time in seconds to
     * visit all the points in the order given by points.
     * You can move according to these rules:
     * - In 1 second, you can either:
     *   - move vertically by one unit,
     *   - move horizontally by one unit, or
     *   - move diagonally sqrt(2) units (in other words, move one unit
     *     vertically then one unit horizontally in 1 second).
     * - You have to visit the points in the same order as they appear
     *   int the array.
     * - You are allowed to pass through points that appear later in the
     *   order, but these do not count as visits.
     *
     * @param points points.length == n
     *               1 <= n <= 100
     *               points[i].length == 2
     *               -1000 <= points[i][0], points[i][1] <= 1000
     * @return min time to visit all points one by one.
     */
    int minTimeToVisitAllPoints(int[][] points);
}
