package org.willxu.algorithm.service.integer;

public interface MinimumScoreTriangulationOfPolygon {
    /**
     * You have a convex n-sided polygon where each vertex has an
     * integer value. You are given an integer array values where
     * values[i] is the value of the i^th vertex (i.e., clockwise
     * order).
     * <p>
     * You will triangulate the polygon into n - 2 triangles. For each
     * triangle, the value of that triangle is the product of the values
     * of its vertices, and the total score of the triangulation is the
     * sum of these values over all n - 2 triangles in the triangulation.
     * <p>
     * Return the smallest possible total score that you can achieve
     * with some triangulation of the polygon.
     *
     * @param values n == values.length
     *               3 <= n <= 50
     *               1 <= values[i] <= 100
     */
    int minScoreTriangulation(int[] values);
}
