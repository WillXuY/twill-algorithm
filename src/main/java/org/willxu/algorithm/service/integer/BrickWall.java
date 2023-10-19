package org.willxu.algorithm.service.integer;

import java.util.List;

public interface BrickWall {
    /**
     * There is a rectangular brick wall in front of you with n rows of
     * bricks. The i^th row has some number of bricks each of the same
     * height (i.e., one unit) but they can be of different widths. The
     * total width of each row is the same.
     * <p>
     * Draw a vertical line from the top to the bottom and cross the
     * least bricks. If your line goes through the edge of a brick, then
     * the brick is not considered as crossed. You cannot draw a line
     * just along one of the two vertical edges of the wall, in which
     * case the line will obviously cross no bricks.
     * <p>
     * Given the 2D array wall that contains the information about the
     * wall, return the minimum number of crossed bricks after drawing
     * such a vertical line.
     *
     * @param wall n == wall.length
     *             1 <= n <= 10^4
     *             1 <= wall[i].length <= 10^4
     *             1 <= sum(wall[i].length) <= 2 * 10^4
     *             sum(wall[i]) is the same for each row i.
     *             1 <= wall[i][j] <= 2^31 - 1
     */
    int leastBricks(List<List<Integer>> wall);
}
