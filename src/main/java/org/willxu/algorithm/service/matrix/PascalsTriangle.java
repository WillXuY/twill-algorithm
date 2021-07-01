package org.willxu.algorithm.service.matrix;

import java.util.List;

public interface PascalsTriangle {
    /**
     * Given an integer numRows, return the first numRows of Pascal's
     * triangle.
     *
     * In Pascals triangle, each number is the sum of the two numbers
     * directly above it as shown:
     *
     * @param numRows 1 <= numRows <= 30
     * @return Pascal's Triangle
     */
    List<List<Integer>> generate(int numRows);
}
