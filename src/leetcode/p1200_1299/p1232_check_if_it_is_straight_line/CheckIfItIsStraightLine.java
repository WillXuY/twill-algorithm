package leetcode.p1200_1299.p1232_check_if_it_is_straight_line;

public interface CheckIfItIsStraightLine {
    /**
     * You are given an array coordinates, coordinates[i] = [x, y],
     * where [x, y] represents the coordinate of a point. Check if
     * these points make a straight line in the XY plane.
     *
     * @param coordinates 2 <= coordinates.length <= 1000
     *                    coordinates[i].length == 2
     *                    -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
     *                    coordinates contains no duplicate point.
     * @return check coordinates are in one straight line.
     */
    boolean checkStraightLine(int[][] coordinates);
}
