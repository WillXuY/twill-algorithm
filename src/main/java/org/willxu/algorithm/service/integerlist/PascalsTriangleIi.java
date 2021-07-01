package org.willxu.algorithm.service.integerlist;

import java.util.List;

public interface PascalsTriangleIi {
    /**
     * Given an integer rowIndex, return the rowIndex^th (0-indexed)
     * row of the Pascal's triangle.
     *
     * In Pascal's triangle, eac number is the sum of the two numbers
     * directly above it as shown:
     *
     * @param rowIndex 0 <= rowIndex <= 33
     * @return row with index in Pascal's triangle
     */
    List<Integer> getRow(int rowIndex);
}
