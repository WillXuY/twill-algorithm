package leetcode.p0100_0199.p0120_triangle;

import java.util.List;

public interface Triangle {
    /**
     * Given a triangle array, return the minimum path sum from top to
     * bottom.
     * <p>
     * For each step, you may move to an adjacent number of the row
     * below. More formally, if you are on index i on the current row,
     * you may move to either index i or index i + 1 on the next row.
     *
     * @param triangle 1 <= triangle.length <= 200
     *                 triangle[0].length == 1
     *                 triangle[i].length == triangle[i - 1].length + 1
     *                 -104 <= triangle[i][j] <= 104
     */
    int minimumTotal(List<List<Integer>> triangle);
}
