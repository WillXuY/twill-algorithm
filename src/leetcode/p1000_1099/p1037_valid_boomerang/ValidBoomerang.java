package leetcode.p1000_1099.p1037_valid_boomerang;

public interface ValidBoomerang {
    /**
     * Given an array points where points[i] = [x_i, y_i] represents a
     * point on the X-Y plane, return true if these points are a
     * boomerang.
     * A boomerang is a set of three points that are all distinct and
     * not in a straight line.
     *
     * @param points points.length = 3
     *               points[i].length = 2
     *               0 <= x_i, y_i <= 100
     * @return points is boomerang.
     */
    boolean isBoomerang(int[][] points);
}
