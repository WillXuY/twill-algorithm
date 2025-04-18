package leetcode.p1200_1299.p1266_minimum_time_visiting_all_points;

public class MinimumTimeVisitingAllPointsAbs
        implements MinimumTimeVisitingAllPoints {
    @Override
    public int minTimeToVisitAllPoints(int[][] points) {
        int output = 0;
        for (int i = 1; i < points.length; i++) {
            output += Math.max(Math.abs(points[i][0] - points[i - 1][0]),
                    Math.abs(points[i][1] - points[i - 1][1]));
        }
        return output;
    }
}
